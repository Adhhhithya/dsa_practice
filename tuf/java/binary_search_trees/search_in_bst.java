class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right= null;
    }
}
public class search_in_bst {
    public static Node searchBST(Node root , int val){
        while(root!=null && root.data!=val){
            root = val < root.data ? root.left : root.right;
        }
        return root;
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
        int val = 10;
        Node result = searchBST(root, val);
        if(result != null){
            System.out.println("Node with value " + val + " found: " + result.data);
        } else {
            System.out.println("Node with value " + val + " not found.");
        }
    }
}
