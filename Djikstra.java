import java.util.HashMap;
import java.util.Map;


/**
 * source ->     1 3 3 4
 * destination ->2 2 1 2
 * weights ->    2 3 3 1
 */

public class Djikstra {
    public static int dijkstra(int[][] graph, int n) {

        int[][] connect = new int[n][n];
        boolean[] visitedVertex = new boolean[n];
        int[] distance = new int[n];

        for (int i = 0; i < n; i++) {
            visitedVertex[i] = false;
            distance[i] = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                connect[i][j] = 1;
            }
        }

        for (int[] edge : graph) {
            connect[edge[0]-1][edge[1]-1] = edge[2];
        }

        // Distance of self loop is zero
        distance[0] = 0;
        for (int i = 0; i < n; i++) {

            // Update the distance between neighbouring vertex and source vertex
            int u = findMinDistance(distance, visitedVertex);
            visitedVertex[u] = true;

            // Update all the neighbouring vertex distances
            for (int v = 0; v < n; v++) {
                if (!visitedVertex[v] && connect[u][v] != 0 && (distance[u] + connect[u][v] < distance[v])) {
                    distance[v] = distance[u] + connect[u][v];
                }
            }
        }
        return distance[n-1];
    }

    private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
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

    public static void main(String[] args) {
        int[][] graph = {{1, 2, 3}, {1, 3, 3}, {1, 4, 3}, {2, 1, 3}};
        System.out.println(dijkstra(graph, 4));
    }
}
