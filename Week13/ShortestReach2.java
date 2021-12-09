import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Edge {
	int node;
	int cost;

	public Edge(int n, int c) {
		node = n;
		cost = c;
	}

}

public class ShortestReach2 {
	public static HashMap<Integer, ArrayList<Edge>> adjList;

	public static Comparator<Edge> costComparator = new Comparator<Edge>() {
		public int compare(Edge e1, Edge e2) {
			return e1.cost - e2.cost;
		}
	};

	public static void dijkstra(int start, int[] shortestPaths) {
		Queue<Edge> queue = new PriorityQueue<>(16, costComparator);
		queue.add(new Edge(start, 0));

		HashSet<Integer> visited = new HashSet<>();

		while (queue.size() > 0) {
			Edge curr = queue.poll();
			int currNode = curr.node;
			int currCost = curr.cost;

			if (visited.contains(currNode)) {
				continue;
			}
			visited.add(currNode);

			shortestPaths[currNode] = currCost;

			ArrayList<Edge> reachNodes = adjList.get(currNode);
			for (int i = 0; i < reachNodes.size(); i++) {
				queue.add(new Edge(reachNodes.get(i).node, reachNodes.get(i).cost + currCost));
			}
		}
	}

}
