import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestReach {
	public static int[] findShortestReach(ArrayList<ArrayList<Integer>> graph, int start) {
        int[] distances = new int[graph.size()];
        boolean[] visited = new boolean[graph.size()];
        int DISTANCE = 6;
        for (int i = 0; i < distances.length; ++i) {
            distances[i] = -1;
            visited[i] = false;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        distances[start] = 0;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (Integer w : graph.get(v)) {
                if (!visited[w]) {
                    queue.add(w);
                    visited[w] = true;
                    distances[w] = distances[v] + DISTANCE;
                }
            }
        }
        return distances;
    } 
}
