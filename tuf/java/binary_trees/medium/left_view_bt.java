import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
public class left_view_bt {
    public List<Integer> left_view(Node root){
        List<Integer> ans = new ArrayList<>();
        left_traversal(root,ans,0);
        return ans;
    }
    public static void left_traversal(Node curr , List<Integer> ans,int depth){
        if(curr==null){
            return;
        }
        if(depth==ans.size()){
            ans.add(curr.data);
        }
        left_traversal(curr.left,ans,depth+1);
        left_traversal(curr.right,ans,depth+1);
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.left.right.left = new Node(6);
        left_view_bt tree = new left_view_bt();
        List<Integer> res = tree.left_view(root);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}
