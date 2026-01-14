import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class validate_bst {
    public static boolean isValidBST(Node root) {
        return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean validate(Node root, long min , long max){
        if(root==null) return true;
        if(root.data<=min || root.data>=max) return false;
        return validate(root.left,min,root.data) && validate(root.right,root.data,max);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(12);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.left.right.left = new Node(6);
        root.right.left = new Node(10);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        
        boolean result = isValidBST(root);
        if(result){
            System.out.println("The given tree is a valid Binary Search Tree.");
        } else {
            System.out.println("The given tree is NOT a valid Binary Search Tree.");
        }
    }
}
