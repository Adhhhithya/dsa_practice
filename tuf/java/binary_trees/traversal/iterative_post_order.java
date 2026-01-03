import java.util.*;

class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data = data;
        left=right=null;
    }
}
public class iterative_post_order {
    public static 
    List<Integer> post_order(Node root){
        List<Integer> postorder = new ArrayList<>();
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.add(root);
            if(root.left!=null){
                st1.push(root.left);
            }
            if(root.right!=null){
                st1.push(root.right);
            }
        }
        while(!st2.isEmpty()){
            postorder.add(st2.pop().data);
        }
        return postorder;
    }
    public static void main(String[] args){
        iterative_post_order tree = new iterative_post_order();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Iterative Post-order Traversal of Binary Tree:");
        List<Integer> result = tree.post_order(root);
        System.out.println(result);
    }
}
