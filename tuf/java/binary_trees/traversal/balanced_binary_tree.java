class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data = data;
        left=right=null;
    }
}
public class balanced_binary_tree {
    public static boolean isBalanced(Node root){
        return height(root)!=-1;
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        if(lh==-1 || rh==-1){
            return -1;
        }
        if(Math.abs(lh-rh)>1){
            return -1;
        }
        return Math.max(lh,rh)+1;
    }
    public static void main(String[] args){
        balanced_binary_tree tree = new balanced_binary_tree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        if(isBalanced(root)){
            System.out.println("The binary tree is balanced.");
        }else{
            System.out.println("The binary tree is not balanced.");
        }
    }
}
