import java.util.*;
class Node{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
public class lca_bst {
    public static Node lca (Node root,Node p, Node q){
        if(root==null) return root;
        int curr = root.data;
        if(curr < p.data && curr < q.data){
            return lca(root.right,p,q);
        }
        if(curr > p.data && curr > q.data){
            return lca(root.left,p,q);
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(4);
        root.right = new Node(13);
        root.left.left = new Node(3);
        root.left.right = new Node(8);
        root.right.left = new Node(11);
        root.right.right = new Node(15);
        root.left.left.left = new Node(1);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(9);
        root.left.left.left.right = new Node(2);
        root.left.right.left.left = new Node(5);
        root.left.right.left.right = new Node(7);

        Node p = root.left.left.left.right; // Node with value 2
        Node q = root.left.right.left.right; // Node with value 7

        Node lcaNode = lca(root, p, q);
        System.out.println("LCA of " + p.data + " and " + q.data + " is: " + lcaNode.data);
    }

}
