import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
	int nodeOne;
	int nodeTwo;
	int weight;

	public Edge(int nodeOne, int nodeTwo, int weight) {
		this.nodeOne = nodeOne;
		this.nodeTwo = nodeTwo;
		this.weight = weight;
	}

	@Override
	public int compareTo(Edge arg0) {
		return this.weight - arg0.weight;
	}
}

class DisjointUnionSet {
	private int[] parent;
	private int[] rank;
	private int numberOfNodes;

	public DisjointUnionSet(int numberOfNodes) {
		this.numberOfNodes = numberOfNodes;
		parent = new int[numberOfNodes + 1];
		rank = new int[numberOfNodes + 1];
		makeSet();
	}

	private void makeSet() {
		for (int i = 1; i < numberOfNodes + 1; i++) {
			parent[i] = i;
		}
	}

	public int find(int i) {
		if (parent[i] != i) {
			parent[i] = find(parent[i]);
		}
		return parent[i];
	}

	public void union(int one, int two) {
		int oneRoot = find(one);
		int twoRoot = find(two);

		if (rank[oneRoot] < rank[twoRoot]) {
			parent[oneRoot] = twoRoot;
		} else if (rank[oneRoot] > rank[twoRoot]) {
			parent[twoRoot] = oneRoot;
		} else {
			parent[twoRoot] = oneRoot;
			rank[oneRoot] = rank[oneRoot] + 1;
		}
	}

}

public class KruskalMST {
	private static DisjointUnionSet disjointUnionSet;
	static Edge[] edge;

	private static int kruskal_MST_ReallySpecialSubtree(int numberOfNodes) {
		Arrays.sort(edge);
		int index_allEdges = 0;
		int numberOfEdges_ReallySpecialSubtree = 0;
		int totalWeight_ReallySpecialSubtree = 0;

		while (true) {
			Edge currentEdge = edge[index_allEdges];
			int firstRoot = disjointUnionSet.find(currentEdge.nodeOne);
			int secondRoot = disjointUnionSet.find(currentEdge.nodeTwo);
			if (firstRoot != secondRoot) {
				disjointUnionSet.union(currentEdge.nodeOne, currentEdge.nodeTwo);
				totalWeight_ReallySpecialSubtree += currentEdge.weight;
				numberOfEdges_ReallySpecialSubtree++;
				if (numberOfEdges_ReallySpecialSubtree == numberOfNodes - 1) {
					break;
				}
			}
			index_allEdges++;
		}
		return totalWeight_ReallySpecialSubtree;
	}

}
