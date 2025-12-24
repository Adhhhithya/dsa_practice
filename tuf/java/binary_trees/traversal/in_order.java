class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class in_order {
    public void in_order_traversal(Node root){
        if(root==null){
            return;
        }
        in_order_traversal(root.left);
        System.out.print(root.data+" ");
        in_order_traversal(root.right);
    }
    public static void main(String[] args){
        in_order tree = new in_order();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("In-order Traversal of Binary Tree:");
        tree.in_order_traversal(root);
    }
}
