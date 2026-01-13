import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class delete_node_bst {
    public static Node deleteNode(Node root , int key){
        if(root==null) return null;
        if(root.data==key){
            return helper(root);
        }
        Node dummy = root;
        while(root!=null){
            if(root.data > key){
                if(root.left!=null && root.left.data==key){
                    root.left=helper(root.left);
                    break;
                }else{
                    root=root.left;
                }
            }else{
                if(root.right!=null && root.right.data==key){
                    root.right = helper(root.right);
                    break;
                }else{
                    root=root.right;
                }
            }
        }
        return dummy;
    }
    public static Node helper(Node root){
        if(root.left==null) return root.right;
        else if(root.right==null) return root.left;
        Node rightChild = root.right;
        Node lastRight = findLastRight(root.left);
        lastRight.right=rightChild;
        return  root.left;
    }

    public static Node findLastRight(Node root){
        if(root.right==null) return root;
        return findLastRight(root.right);
    }
    public static void print_bst(Node root){
        if(root==null) return;
        print_bst(root.left);
        System.out.print(root.data + " ");
        print_bst(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(12);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(10);
        root.right.right = new Node(13);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(3);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(8);
        root.left.left.right.right = new Node(4);
        int key = 8;
        root = deleteNode(root, key);
        // System.out.print(root.data);
        System.out.print("BST after deletion: ");
        print_bst(root);

    }
}
