import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SpecialSubtree {
	public static class Edge {
		int destination;
		int weight;

		public Edge(int destination, int weight) {
			this.destination = destination;
			this.weight = weight;
		}
	}

	public static class Node {
		int id;
		int key;
		ArrayList<Edge> edge;

		public Node(int id) {
			this.id = id;
			this.key = Integer.MAX_VALUE;
			this.edge = new ArrayList<SpecialSubtree.Edge>();
		}

	}

	public static class Graph {
		Map<Integer, Node> map = new HashMap<Integer, SpecialSubtree.Node>();

		public Graph(int n) {
			for (int i = 1; i <= n; i++) {
				Node node = new Node(i);
				map.put(i, node);
			}
		}

		void addEdge(int source, int destination, int weight) {
			Node node = map.get(source);
			Edge edge = new Edge(destination, weight);
			node.edge.add(edge);

			node = map.get(destination);
			edge = new Edge(source, weight);
			node.edge.add(edge);
		}
	}

	public static void Prims(Graph graph, int n, int start) {
		Node node = graph.map.get(start);
		node.key = 0;
		PriorityQueue<Node> pq = new PriorityQueue<Node>(new Comparator<Node>() {

			public int compare(Node o1, Node o2) {
				return Integer.compare(o1.key, o2.key);
			}
		});
		pq.add(node);
		boolean[] visited = new boolean[n + 1];
		Arrays.fill(visited, false);
		while (!pq.isEmpty()) {
			node = pq.remove();
			if (visited[node.id])
				continue;
			visited[node.id] = true;
			ArrayList<Edge> edgeList = node.edge;

			for (Edge edge : edgeList) {
				Node tempNode = graph.map.get(edge.destination);
				if (!visited[tempNode.id] && edge.weight < tempNode.key) {
					tempNode.key = edge.weight;
					pq.add(tempNode);
				}
			}
		}
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += graph.map.get(i).key;
		}
		System.out.println(sum);

	}
}
