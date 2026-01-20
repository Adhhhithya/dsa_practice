import java.util.*;
class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}
class NodeVal{
    public int minNode, maxNode , maxSize;
    public NodeVal(int minNode,int maxNode, int maxSize){
        this.minNode=minNode;
        this.maxNode=maxNode;
        this.maxSize=maxSize;
    } 
}
public class largest_bst_in_bt {
    public static int largest_bst_size(Node root){
        return helper(root).maxSize;
    }

    public static NodeVal helper(Node root){
        if(root==null){
            return new NodeVal(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }
        NodeVal left = helper(root.left);
        NodeVal right = helper(root.right);

        if(left.maxNode < root.data && root.data < right.minNode){
            return new NodeVal(
                Math.min(root.data,left.minNode),
                Math.max(root.data,right.maxNode),
                left.maxSize+right.maxSize+1
            );
        }
        return new NodeVal(
            Integer.MIN_VALUE,
            Integer.MAX_VALUE,
            Math.max(left.maxSize,right.maxSize)
        );
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(15);
        root.right = new Node(40);
        root.left.left = new Node(14);
        root.left.right = new Node(18);
        root.right.left = new Node(30);
        root.right.right = new Node(60);
        root.left.left.right = new Node(17);
        root.left.right.left = new Node(16);
        root.left.right.right = new Node(19);
        root.right.right.left = new Node(50);
        
        System.out.println("Size of the largest BST : "+largest_bst_size(root));
    }
}
