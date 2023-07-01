import java.util.*;
public class DFS {
    static  class Edge{
        int src;
        int des;
        int w;

        public Edge(int s,int d,int w){
            this.src=s;
            this.des=d;
            this.w=w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }

        graph[0].add( new Edge(0,1,2));
        graph[0].add( new Edge(0,2,2));

        graph[1].add( new Edge(1,3,10));
        graph[1].add( new Edge(1,0,0));

        graph[2].add( new Edge(2,0,2));
        graph[2].add( new Edge(2,4,10));


        graph[3].add( new Edge(3,1,0));
        graph[3].add( new Edge(3,5,-1));
        graph[3].add( new Edge(0,4,2));

        graph[4].add( new Edge(4,3,2));
        graph[4].add( new Edge(4,2,96));
        graph[4].add( new Edge(4,5,2));

        graph[5].add( new Edge(5,3,22));
        graph[5].add( new Edge(5,4,21));
        graph[5].add( new Edge(5,6,2));

        graph[6].add( new Edge(6,5,52));

    }

    public static void dfs(ArrayList<Edge>graph[],int curr,boolean visited[]){
        if(visited[curr]) {
            return;
        }
        System.out.print(curr+" ");
        visited[curr] = true;
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            dfs(graph, e.des, visited);
        }
    }
    public static void main(String[] args){
        int V=7;

        ArrayList<Edge> graph[]= new ArrayList[V];

        createGraph(graph);

        boolean visited[]= new boolean[V];
        dfs(graph,0,visited);

    }
}
