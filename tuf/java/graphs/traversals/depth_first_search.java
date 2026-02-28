import java.util.*; 
public class depth_first_search {
    private static void dfs(int node,boolean vis[],List<List<Integer>> adj,List<Integer> ans){
        vis[node] = true;
        ans.add(node);

        for(int i:adj.get(node)){
            if(vis[i]==false){
                dfs(i,vis,adj,ans);
            }
        }
    }
    public static List<Integer> dfsOfGraph(int V , List<List<Integer>> adj){
        List<Integer> ans = new ArrayList<>();
        boolean vis[] = new boolean[V];
        dfs(0,vis,adj,ans);
        return ans;
    }
    
    public static void main(String[] args){
        int V = 8;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        // 1=[2,3] -> 0=[1,2]
        // 2=[1,5,6] -> 1=[0,4,5]
        // 3=[1,4,7] -> 2=[0,3,6]
        // 4=[3,8] -> 3=[2,7]
        // 5=[2] -> 4=[1]
        // 6=[2] -> 5=[1]
        // 7=[3,8] -> 6=[2,7]
        // 8=[4,7] -> 7=[3,6]
        
        adj.get(0).addAll(Arrays.asList(1, 2));
        adj.get(1).addAll(Arrays.asList(0, 4, 5));
        adj.get(2).addAll(Arrays.asList(0, 3, 6));
        adj.get(3).addAll(Arrays.asList(2, 7));
        adj.get(4).addAll(Arrays.asList(1));
        adj.get(5).addAll(Arrays.asList(1));
        adj.get(6).addAll(Arrays.asList(2, 7));
        adj.get(7).addAll(Arrays.asList(3, 6));
        
        List<Integer> ans = dfsOfGraph(V,adj);
        System.out.println("DFS Traversal: ");
        for(int i: ans){
            System.out.print(i+1+" ");
        }
    }
}

