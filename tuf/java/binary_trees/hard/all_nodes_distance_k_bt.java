import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class all_nodes_distance_k_bt {
    public static void mark_parents(Node root,Map<Node,Node> parent_track,Node target){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr.left!=null){
                parent_track.put(curr.left,curr);
                q.add(curr.left);
            }
            if(curr.right!=null){
                parent_track.put(curr.right,curr);
                q.add(curr.right);
            }
        }
    }
    public static List<Integer> distance_k_nodes(Node root ,Node target, int k){
        Map<Node,Node> parent_track = new HashMap<>();
        mark_parents(root,parent_track,target);
        Map<Node,Boolean> visited = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(target);
        visited.put(target,true);
        int curr_level=0;
        while(!q.isEmpty()){
            int size = q.size();
            if(curr_level==k) break;
            for(int i=0;i<size;i++){
                Node curr = q.poll();

                if(curr.left!=null && visited.get(curr.left)==null){
                    q.add(curr.left);
                    visited.put(curr.left,true);
                }
                if(curr.right!=null && visited.get(curr.right)==null){
                    q.add(curr.right);
                    visited.put(curr.right,true);
                }
                if(parent_track.get(curr)!=null && visited.get(parent_track.get(curr))==null){
                    q.add(parent_track.get(curr));
                    visited.put(parent_track.get(curr),true);
                }
            }
            curr_level++;
        }
        List<Integer> res = new ArrayList<>();
        while(!q.isEmpty()){
            Node curr = q.poll();
            res.add(curr.data);
        }
        return res;
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);
        Node target = root.left; 
        int k = 2;
        List<Integer> result = distance_k_nodes(root, target, k);
        System.out.println("Nodes at distance " + k + " from target node " + target.data + ": " + result);
    }
}
