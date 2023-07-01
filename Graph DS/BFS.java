import java.util.*;
public class BFS {
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

    public static void bfs(ArrayList<Edge> graph[],int V){
        boolean [] vis= new boolean[V];

        Queue<Integer> q= new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                System.out.print(curr+ " ");
                vis[curr]=true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.des);
                }
            }

        }

    }
    public static void main(String[] args){
        int V=7;

        ArrayList<Edge> graph[]= new ArrayList[V];

        createGraph(graph);

        bfs(graph,V);

    }
}
