class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class child_sum_property_bt {
    public static void child_sum_change_tree(Node root){
        if(root==null) return;
        int child =0;
        if(root.left!=null) child+=root.left.data;
        if(root.right!=null) child+=root.right.data;
        if(child>=root.data){
            root.data=child;
        }
        else{
            if(root.left!=null) root.left.data=root.data;
            else if(root.right!=null) root.right.data=root.data;
        }
        child_sum_change_tree(root.left);
        child_sum_change_tree(root.right);
        int total =0;
        if(root.left!=null) total+=root.left.data;
        if(root.right!=null) total+=root.right.data;
        if(root.left!=null || root.right!=null){
            root.data=total;
        }
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args){
        Node root = new Node(50);
        root.left = new Node(7);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(1);
        root.right.right = new Node(30);
        System.out.println("Inorder traversal before conversion:");
        inorder(root);
        child_sum_change_tree(root);
        System.out.println("\nInorder traversal after conversion:");
        inorder(root);
    }
}
