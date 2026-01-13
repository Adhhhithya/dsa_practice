import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class insert_into_bst {
    public static Node insert(Node root , int val){
        if(root ==null) {return new Node(val);}
        Node curr = root;
        while(true){
            if(curr.data<=val){
                if(curr.right!=null) curr = curr.right;
                else{
                    curr.right= new Node(val);
                    break;
                }
            }else{
                if(curr.left!=null) curr = curr.left;
                else{
                    curr.left = new Node(val);
                    break;
                }
            }
        }
        return root;
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
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.right.left = new Node(10);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        int val = 20;
        root = insert(root, val);
        System.out.print("BST after insertion: ");
        print_bst(root);
        
    }
}
