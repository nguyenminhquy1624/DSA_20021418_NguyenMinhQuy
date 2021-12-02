import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RoadLibrary {
	static boolean[] visited;
    static int[] edgeTo;

    public static void roadsAndLibraries(ArrayList<ArrayList<Integer>> cities, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (Integer w : cities.get(v)) {
                if (!visited[w]) {
                    queue.add(w);
                    visited[w] = true;
                    edgeTo[w] = v;
                }
            }
        }
    }
}
