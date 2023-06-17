import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DijkstraAdjacencyList {

    public static void Graph1(int[][] graph, int vertices) {
        ArrayList<Map<Integer,Integer>>[] map = new ArrayList[vertices+1];
        for(int i=0;i<graph.length;i++)
        {

        }
    }

    public static void main(String args[]) {
        int vertices = 3;
        int[][] graph = {{1, 2, 3}, {1, 3, 3}};
        Graph1(graph, vertices);
    }
}
