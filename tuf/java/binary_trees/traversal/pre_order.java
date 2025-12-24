class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left=right=null;
    }
}
public class pre_order {
    public void pre_order_traversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        pre_order_traversal(root.left);
        pre_order_traversal(root.right);
    }
    public static void main(String[] args){
        pre_order tree = new pre_order();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Pre-order Traversal of Binary Tree:");
        tree.pre_order_traversal(root);
    }
}
