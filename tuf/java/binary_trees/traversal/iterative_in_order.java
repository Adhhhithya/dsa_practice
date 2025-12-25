import java.util.*;
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data = data;
        left=right=null;
    }
}
public class iterative_in_order {
    public List<Integer> in_order(Node root){
        List<Integer> preorder = new ArrayList<>();
        if(root==null){
            return preorder;
        }
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            preorder.add(root.data);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
        }
        return preorder;
    }
    public static void main(String[] args){
        iterative_in_order tree = new iterative_in_order();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("In-order Traversal of Binary Tree:");
        List<Integer> result = tree.in_order(root);
        System.out.println(result);
    }
}
