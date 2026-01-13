import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class kth_smallest_largest_bst {
    public static List<Integer> kthSmallestLargest(Node root,int k){
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        inorder(root,ans);
        int kthSmallest = ans.get(k-1);
        int kthLargest = ans.get(ans.size()-k);
        return Arrays.asList(kthSmallest,kthLargest);
    }
    public static void inorder(Node root,List<Integer> ans){
        if(root!=null){
            inorder(root.left,ans);
            ans.add(root.data);
            inorder(root.right,ans);
        }
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
        int k = 3;
        List<Integer> result = kthSmallestLargest(root, k);
        System.out.println("The " + k + "th smallest element is: " + result.get(0));
        System.out.println("The " + k + "th largest element is: " + result.get(1));
    }
}
