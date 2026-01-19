import java.util.*;
class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}
class BST_Iterator{
    private Stack<Node> st = new Stack<>();
    boolean reverse = true;

    public BST_Iterator(Node root, boolean is_reverse){
        reverse = is_reverse;
        pushAll(root);
    }

    public boolean hasNext(){
        return !st.isEmpty();
    }

    public int next(){
        Node temp = st.pop();
        if(reverse==false) pushAll(temp.right);
        else pushAll(temp.left);
        return temp.data;
    }

    private void pushAll(Node node){
        while(node!=null){
            st.push(node);
            if(reverse==true) node = node.right;
            else node = node.left;
        }
    }

}
public class two_sum_bst {
    private static boolean two_sum(Node root, int k){
        if(root==null) return false;
        BST_Iterator l = new BST_Iterator(root, false);
        BST_Iterator r = new BST_Iterator(root, true);
        int i = l.next();
        int j = r.next();

        while(i<j){
            if((i+j)==k) return true;
            else if((i+j)<k) i = l.next();
            else j = r.next();
        }
        return false;
    }
    public static void main(String[] args){
        Node root = new Node(7);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        root.left.left.left = new Node(1);
        root.left.right.left = new Node(5);
        root.left.right.left.left = new Node(4);
        root.right.left = new Node(9);
        root.right.right = new Node(11);
        root.right.left.left = new Node(8);

        int k = 16;
        if(two_sum(root, k)){
            System.out.println("Found a pair with sum " + k);
        } else {
            System.out.println("No pair with sum " + k);
        }
    }
}
