import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
public class inorder_successor_predecessor_bst {
    public static List<Integer> find_inorder_succ_pred(Node root, int key){
        int succesor = -1;
        int predecessor = -1;
        Node curr = root;
        while(curr!=null){
            if(curr.data > key){
                succesor = curr.data;
                curr = curr.left;
            }else{
                curr = curr.right;
            }
        }
        curr = root;
        while(curr!=null){
            if(curr.data < key){
                predecessor = curr.data;
                curr = curr.right;
            }else{
                curr = curr.left;
            }
        }
        return Arrays.asList(succesor,predecessor);
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(9);
        root.left.right.left = new Node(3);
        root.right.right.left = new Node(8);
        root.right.right.right = new Node(10);

        int key = 9;
        List<Integer> result = find_inorder_succ_pred(root, key);
        System.out.println("Inorder Successor: " + result.get(0));
        System.out.println("Inorder Predecessor: " + result.get(1));
    }
}
