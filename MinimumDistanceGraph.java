import java.util.HashMap;
import java.util.Map;

public class MinimumDistanceGraph {
    public int dijkstra(int[][] graph, int source) {

        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

        for (int[] edge : graph) {
            map.computeIfAbsent(edge[0], x -> new HashMap<>());
            map.get(edge[0]).put(edge[1], edge[2]);
        }

        int count = graph.length;
        Map<Integer, Integer> val = map.get(0);
        if (val == null)
            return 1;
        boolean[] visitedVertex = new boolean[count];
        int[] distance = new int[count];
        for (int i = 0; i < count; i++) {
            visitedVertex[i] = false;
            distance[i] = val.getOrDefault(i, 1);
        }

        // Distance of self loop is zero
        distance[0] = 0;
        for (int i = 0; i < count; i++) {

            // Update the distance between neighbouring vertex and source vertex
            int u = findMinDistance(distance, visitedVertex);
            visitedVertex[u] = true;

            // Update all the neighbouring vertex distances
            for (int v = 0; v < count; v++) {
                if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }
        return distance[source];
    }

    private int findMinDistance(int[] distance, boolean[] visitedVertex) {
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visitedVertex[i] && distance[i] < minDistance) {
                minDistance = distance[i];
                minDistanceVertex = i;
            }
        }
        return minDistanceVertex;
    }
}
