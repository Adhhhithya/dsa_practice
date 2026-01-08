import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class lowest_common_ancestor {
    public static Node lca(Node root,Node p,Node q){
        if(root==null|root==p||root==q){
            return root;
        }
        Node left = lca(root.left,p,q);
        Node right = lca(root.right,p,q);
        if(left==null){
            return right;
        }else if(right==null){
            return left;
        }else{
            return root;
        }
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.right.left.left = new Node(8);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(7);
        Node p = root.right.right.right; // Node with value 7
        Node q = root.right.left.left; // Node with value 8
        Node ancestor = lca(root, p, q);
        if (ancestor != null) {
            System.out.println("Lowest Common Ancestor of " + p.data + " and " + q.data + " is: " + ancestor.data);
        } else {
            System.out.println("Lowest Common Ancestor not found.");
        }
    }
}

