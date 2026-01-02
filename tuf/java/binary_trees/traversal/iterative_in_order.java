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
        List<Integer> inorder = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node node = root;
        while(true){
            if(node!=null){
                st.push(node);
                node= node.left;
            }else{
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                inorder.add(node.data);
                node = node.right;
            }
        }
        return inorder;
    }
    public static void main(String[] args){
        iterative_in_order tree = new iterative_in_order();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Iterative In-order Traversal of Binary Tree:");
        List<Integer> result = tree.in_order(root);
        System.out.println(result);

    }
}
