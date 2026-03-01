import java.util.*;
public class count_connected_components {
    public static int countComponents(int V,List<List<Integer>> edges){
         int E = edges.size();
         List<Integer>[] adj = new ArrayList[V];
         for(int i=0;i<V;i++){
            adj[i] = new ArrayList<>();
         }
         for(int i=0;i<E;i++){
            adj[edges.get(i).get(0)].add(edges.get(i).get(1));
            adj[edges.get(i).get(1)].add(edges.get(i).get(0));
         }

         boolean vis[] = new boolean[V];
         int cnt =0;
         for(int i=0;i<V;i++) {
            if(vis[i]==false){
                cnt++;
                bfs(i,vis,adj);
            }
         }
         return cnt;
    }

    private static void bfs(int node,boolean vis[],List<Integer>[] adj){
        Queue<Integer> q = new LinkedList<>();
        vis[node] = true;
        q.add(node);

        while(!q.isEmpty()){
            int curr = q.poll();
            for(int i: adj[curr]){
                if(vis[i]==false){
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
    }
    public static void main(String[] args){
        int V = 5;
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(0,1));
        edges.add(Arrays.asList(1,2));
        edges.add(Arrays.asList(3,4));

        int ans = countComponents(V,edges);
        System.out.println("Number of Connected Components: "+ans);
    }
}