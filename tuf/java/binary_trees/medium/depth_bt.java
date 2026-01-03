class Node {
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}
public class depth_bt {
    public static int depth(Node root){
        if(root==null){
            return 0;
        }
        int ld = depth(root.left);
        int rd = depth(root.right);
        return Math.max(ld,rd)+1;
    }
    public static void main(String[] args){
        depth_bt tree = new depth_bt();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        int depth = depth(root);
        System.out.println("The depth of the binary tree is: " + depth);
    }
}
