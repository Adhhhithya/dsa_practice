import java.util.*;
class Pair{
    int first,second;
    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
class detect_cycle_bfs {
    public static boolean isCycle(int V, List<Integer>[] adj) {
        boolean ans = false;
        boolean vis[] = new boolean[V];
        for(int i=0;i<V;i++) vis[i] = false;

        for(int i=0;i<V;i++){
            if(!vis[i]){
                ans = check_cycle_bfs(i,adj,vis);
                if(ans) break;
            }
        }
        return ans;
    }

    private static boolean check_cycle_bfs(int src, List<Integer>[] adj,boolean[]vis){
        Queue<Pair> q = new LinkedList<>();
        vis[src] = true;
        q.add(new Pair(src,-1));

        while(!q.isEmpty()){
            Pair curr = q.poll();
            int node = curr.first;
            int parent = curr.second;

            for(int it : adj[node]){
                if(!vis[it]){
                    q.add(new Pair(it,node));
                    vis[it] = true;
                }else if(it!=parent){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        detect_cycle_bfs obj = new detect_cycle_bfs();
        List<Integer>[] adj = new ArrayList[5];
        for(int i=0;i<5;i++) adj[i] = new ArrayList<>();

        adj[0].add(1);
        adj[1].add(0);

        adj[1].add(2);
        adj[2].add(1);

        adj[2].add(3);
        adj[3].add(2);

        adj[3].add(4);
        adj[4].add(3);

        adj[4].add(1);
        adj[1].add(4);

        System.out.println(isCycle(5,adj));
    }
}
