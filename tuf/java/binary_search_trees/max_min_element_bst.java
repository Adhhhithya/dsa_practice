

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right= null;
    }
}
public class max_min_element_bst {
    public static int findMax(Node root){
        Node max = root;
        while(max.right!=null){
            max = max.right;
        }
        return max.data;
    }
    public static int findMin(Node root){
        Node min = root;
        while(min.left!=null){
            min=min.left;
        }
        return min.data;
    }
    public static void main(String[] args){
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(12);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.right.left = new Node(10);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        System.out.println("Maximum element in BST: " + findMax(root));
        System.out.println("Minimum element in BST: " + findMin(root));
    }
}
