class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left=right=null;
    }
}
public class post_order {
    public void post_order_traversal(Node root){
        if(root==null){
            return;
        }
        post_order_traversal(root.left);
        post_order_traversal(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args){
        post_order tree = new post_order();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Post-order Traversal of Binary Tree:");
        tree.post_order_traversal(root);
    }
}
