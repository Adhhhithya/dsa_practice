import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class right_view_bt {
    public List<Integer> right_view(Node root){
        List<Integer> ans = new ArrayList<>();
        right_traversal(root,ans,0);
        return ans;
    }
    public static void right_traversal(Node curr, List<Integer> ans , int depth){
        if(curr==null){
            return;
        }
        if(depth==ans.size()){
            ans.add(curr.data);
        }
        right_traversal(curr.right,ans,depth+1);
        right_traversal(curr.left,ans,depth+1);
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.left.right.left = new Node(6);
        right_view_bt tree = new right_view_bt();
        List<Integer> res = tree.right_view(root);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}