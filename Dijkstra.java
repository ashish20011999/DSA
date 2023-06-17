import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Dijkstra {
    public static int findClosestVertex(int[] distance ,boolean[] visited)
    {   int minimumDistance = Integer.MAX_VALUE;
        int vertex = -1;
        for(int i=0;i<distance.length;i++)
        {
            if(visited[i]==false&&distance[i]<minimumDistance)
            {
                minimumDistance=distance[i];
                vertex=i;
            }
        }
        return vertex;
    }
    public static void printSolution(int dist[])
    {
        System.out.println(
                "Vertex \t\t Distance from Source");
        for (int i = 0; i < dist.length; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }
    public static void dijkstra(int[][] graph, int vertices)
    {
        boolean[] visited = new boolean[vertices];
        int[] parent = new int[vertices];
        int[] distance = new int[vertices];



        for(int i=0;i<vertices;i++)
        {
            distance[i] = Integer.MAX_VALUE; //intialised the distance from the source node to all the nodes as infinity;
            parent[i]=-1;
        }
        distance[0] = 0;

        for(int i=0;i<vertices-1;i++)
        {
            int minDistanceNode = findClosestVertex(distance,visited);
            visited[minDistanceNode]=true;

            for(int u = 0;u<graph.length;u++)
            {
             if(distance[minDistanceNode]!=Integer.MAX_VALUE
                     &&graph[minDistanceNode][u]+distance[minDistanceNode]<distance[u]&&
                     visited[u]==false&&graph[u][minDistanceNode]!=0)
             {
                 parent[u]=minDistanceNode;
                 distance[u]=graph[minDistanceNode][u]+distance[minDistanceNode];
             }
            }
        }
        printSolution(distance);

    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;
        public Pair(int node, int cost)
        {
            this.node=node;
            this.cost=cost;
        }

        public int compareTo(Pair p)
        {
            return this.cost-p.cost;
        }
    }
    public static void Prim(ArrayList<Edge>[] graph, int v)
    {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[v];
        pq.add(new Pair(0,0));
        int mstCost = 0;
        while(!pq.isEmpty())
        {   Pair curr = pq.remove();
            if(visited[curr.node]==false)
            {
                visited[curr.node]=true;
                mstCost += curr.cost;
                for(int i=0;i<graph[curr.node].size();i++)
                {   Edge edge = graph[curr.node].get(i);
                    if(visited[edge.destination]=false)
                    {
                        pq.add(new Pair(edge.destination,edge.cost));
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int graph[][]
                = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        dijkstra(graph, 9);
    }
}
