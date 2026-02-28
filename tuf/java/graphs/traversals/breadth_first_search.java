import java.util.*;
public class breadth_first_search {
    private static void bfs(int node,List<List<Integer>> adj, boolean vis[],List<Integer>ans){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        vis[node] = true;

        while(!q.isEmpty()){
            int curr = q.poll();
            ans.add(curr);

            for(int i: adj.get(curr)){
                if(vis[i]==false){
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
    }
    public static List<Integer> bfsOfGraph(int V,List<List<Integer>> adj){
        List<Integer> ans = new ArrayList<>();
        boolean vis[]  = new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                bfs(i,adj,vis,ans);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int V = 9;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        // 1=[2,6] -> 0=[1,5]
        // 2=[1,3,4] -> 1=[0,2,3]
        // 3=[2] -> 2=[1]
        // 4=[2,5] -> 3=[1,4]
        // 5=[4,8] -> 4=[3,7]
        // 6=[1,7,9] -> 5=[0,6,8]
        // 7=[6,8] -> 6=[5,7]
        // 8=[5,7] -> 7=[4,6]
        // 9=[6] -> 8=[5]
        
        adj.get(0).addAll(Arrays.asList(1, 5));
        adj.get(1).addAll(Arrays.asList(0, 2, 3));
        adj.get(2).addAll(Arrays.asList(1));
        adj.get(3).addAll(Arrays.asList(1, 4));
        adj.get(4).addAll(Arrays.asList(3, 7));
        adj.get(5).addAll(Arrays.asList(0, 6, 8));
        adj.get(6).addAll(Arrays.asList(5, 7));
        adj.get(7).addAll(Arrays.asList(4, 6));
        adj.get(8).addAll(Arrays.asList(5));
        
        List<Integer> ans = bfsOfGraph(V,adj);
        System.out.println("BFS Traversal: ");
        for(int i: ans){
            System.out.print(i+1+" ");
        }
    }
}
