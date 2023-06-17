import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

    public class Graphs {
        public void createGraph(ArrayList<Edge> graph[]) {
            for(int i=0;i<graph.length;i++)
            {
                graph[i]= new ArrayList<>();
            }
            graph[0].add(new Edge(0, 1,1));
            graph[0].add(new Edge(0, 2,1));
            graph[1].add(new Edge(1, 0,1));
            graph[1].add(new Edge(1, 3,1));
            graph[2].add(new Edge(2, 0,1));
            graph[2].add(new Edge(2, 4,1));
            graph[3].add(new Edge(3, 1,1));
            graph[3].add(new Edge(3, 4,1));
            graph[3].add(new Edge(3, 5,1));
            graph[4].add(new Edge(4, 2,1));
            graph[4].add(new Edge(4, 3,1));
            graph[4].add(new Edge(4, 5,1));
            graph[5].add(new Edge(5, 3,1));
            graph[5].add(new Edge(5, 4,1));
            graph[5].add(new Edge(5, 6,1));
            graph[6].add(new Edge(6, 5,1));
        }

        public void bfs(ArrayList<Edge> graph[]) {
            Queue<Integer> queue = new LinkedList<>();
            boolean[] visited = new boolean[graph.length];
            queue.add(0);

            while (!queue.isEmpty()) {
                int curr = queue.peek();
                if (visited[curr] == false) {
                    System.out.println(curr);
                    visited[curr] = true;
                    for (int i = 0; i < graph[curr].size(); i++) {
                        Edge edge = graph[curr].get(i);
                        queue.add(edge.destination);
                    }
                } else {
                    queue.remove();
                }
            }
        }
        public static void dfs(ArrayList<Edge>[] graph,int curr,boolean[] visited)
        {
            //this code also works for dfs - khud se likha hai logically
//            visited[curr] =true;
//            for(int i=0;i<graph[curr].size();i++)
//            {
//                Edge edge = graph[curr].get(i);
//                if(visited[edge.destination]==false)
//                {
//                    System.out.println(edge.destination);
//                    dfs(graph,edge.destination,visited);
//                }
//            }

            if(visited[curr]==false)
            {
                System.out.println(curr);
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++)
                {
                    dfs(graph,graph[curr].get(i).destination,visited);
                }
            }
            else
                return;
        }

        public static void printall(ArrayList<Edge>[] graph,int curr,int target,boolean[] visited,String resultString)
        {
            if(curr==target)
            {
                System.out.println(resultString+target);
            }

                for(int i=0;i<graph[curr].size();i++)
                {
                    Edge edge = graph[curr].get(i);
                    if(visited[edge.destination]==false) {
                        visited[curr] = true;
                        printall(graph, edge.destination, target, visited, resultString+curr);
                        visited[curr] = false;
                    }
            }
//            if(curr==target)
//            {
//                System.out.println(resultString+target);
//                return;
//            }
//
//            for(int i=0;i<graph[curr].size();i++)
//            {
//                if(visited[curr]==false)
//                {   Edge edge = graph[curr].get(i);
//                    visited[curr]=true;
//                    printall(graph,edge.destination,target,visited,resultString+curr);
//                    visited[curr]=false;
//                }
//            }

        }

        public void main(String args[]) {
            ArrayList<Edge> graph[] = new ArrayList[7];
            createGraph(graph);
            String resultString ="";
//            bfs(graph);
            boolean[] visited = new boolean[7];
            int curr = 0;
//            dfs(graph,curr,visited);
            printall(graph,0,5,visited,resultString);

        }
    }

