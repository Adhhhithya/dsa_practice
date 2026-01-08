import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Pair{
    Node node;
    int num;
    Pair(Node node,int num){
        this.node=node;
        this.num = num;
    }
}
public class maximum_width_bt {
    public static int max_width(Node root){
        if(root==null) return 0;
        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));

        while(!q.isEmpty()){
            int size = q.size();
            int m_min = q.peek().num;
            int first =0;
            int last =0;

            for(int i=0;i<size;i++){
                int curr_id = q.peek().num - m_min;
                Node node = q.peek().node;
                q.poll();
                if(i==0) first = curr_id;
                if(i==size -1) last = curr_id;
                if(node.left!=null){
                    q.add(new Pair(node.left, curr_id*2+1));
                }
                if(node.right!=null){
                    q.add(new Pair(node.right, curr_id*2+2));
                }
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.left.left = new Node(7);
        root.right.right = new Node(4);
        root.right.right.right = new Node(6);
        int width = max_width(root);
        System.out.println("Maximum width of the binary tree is: " + width);
    }
}
