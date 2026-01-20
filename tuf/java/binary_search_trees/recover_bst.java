class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class recover_bst{
    private static Node prev , first , mid , last;
    public static void recover(Node root){
        first = mid = last = null;
        prev = new Node(Integer.MIN_VALUE);
        inorder(root);
        if(first!=null && last!=null){
            int t = first.data;
            first.data = last.data;
            last.data = t;
        }else if(first!=null && mid!=null){
            int t = first.data;
            first.data = mid.data;
            mid.data = t;
        }
    }

    private static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null &&(root.data < prev.data)){
            if(first==null){
                first = prev;
                mid = root;
            }else{
                last = root;
            }
        }
        prev = root;
        inorder(root.right);
    }

    public static void printTree(Node root){
        if(root==null) return;
        printTree(root.left);
        System.out.print(root.data + " ");
        printTree(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(9);
        root.right = new Node(3);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.right = new Node(13);
        System.out.println("Inorder Traversal of the original tree:");
        printTree(root);
        recover(root);
        System.out.println("\nInorder Traversal of the fixed tree:");
        printTree(root);
    }

}