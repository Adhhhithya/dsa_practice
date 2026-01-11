import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class minimum_burn_time_bt {
    public static int time_to_burn(Node root , int start){
        HashMap<Node,Node> parent_track = new HashMap<>();
        Node target = bfs_map_parents(root,parent_track,start);
        int maxi = find_max_distance(parent_track,target);
        return maxi;
    }
    public static Node bfs_map_parents(Node root, HashMap<Node,Node> parent_track,int start){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node res = new Node(-1);
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr.data==start) res = curr;
            if(curr.left!=null){
                parent_track.put(curr.left,curr);
                q.add(curr.left);
            }
            if(curr.right!=null){
                parent_track.put(curr.right,curr);
                q.add(curr.right);
            }
        }
        return res;
    }

    public static int find_max_distance(HashMap<Node, Node> parent_track, Node target){
        Queue<Node> q = new LinkedList<>();
        q.add(target);
        HashMap<Node,Integer> visited = new HashMap<>();
        visited.put(target,1);
        int maxi =0;
        while(!q.isEmpty()){
            int size = q.size();
            int flag =0;
            for(int i=0;i<size;i++){
                Node curr = q.poll();
                if(curr.left!=null && visited.get(curr.left)==null){
                    flag =1;
                    visited.put(curr.left,1);
                    q.add(curr.left);
                }
                if(curr.right!=null && visited.get(curr.right)==null){
                    flag =1;
                    visited.put(curr.right,1);
                    q.add(curr.right);
                }
                if(parent_track.get(curr)!=null && visited.get(parent_track.get(curr))==null){
                    flag=1;
                    visited.put(parent_track.get(curr),1);
                    q.add(parent_track.get(curr));
                }
            }
            if(flag==1) maxi++;
        }
        return maxi;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.left.left.right = new Node(7);

        int start = 2;
        int burn_time = time_to_burn(root, start);
        System.out.println("Minimum time to burn the binary tree starting from node " + start + " is: " + burn_time);
    }

}