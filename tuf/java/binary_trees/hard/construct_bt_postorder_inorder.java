//Construct a binary tree from given postorder and inorder traversals
import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class construct_bt_postorder_inorder {
    public static Node buildTree(int[] postorder,int[] inorder){
        Map<Integer,Integer> inorder_map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inorder_map.put(inorder[i],i);
        }
        Node root = buildTree(inorder,0,inorder.length-1,
            postorder,0,postorder.length-1,inorder_map);
        return root;
    }
    private static Node buildTree(int[] inorder,int in_start,int in_end,
                            int[] postorder,int post_start,int post_end,
                            Map<Integer,Integer> inorder_map){
        if(post_start > post_end || in_start > in_end){
            return null;
        }
        Node root = new Node(postorder[post_end]);
        int in_root = inorder_map.get(root.data);
        int nums_left = in_root - in_start;
        root.left = buildTree(inorder,in_start,in_root-1,
            postorder,post_start,post_start+nums_left-1,inorder_map);
        root.right = buildTree(inorder,in_root+1,in_end,
            postorder,post_start+nums_left,post_end-1,inorder_map);
        return root;
        }
    public static void main(String[] args) {
        construct_bt_postorder_inorder obj = new construct_bt_postorder_inorder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter postorder traversal:");
        int[] postorder = new int[n];
        for(int i=0;i<n;i++){
            postorder[i]=sc.nextInt();
        }
        System.out.println("Enter inorder traversal:");
        int[] inorder = new int[n];
        for(int i=0;i<n;i++){
            inorder[i]=sc.nextInt();
        }
        Node root = obj.buildTree(postorder,inorder);
        System.out.println("Root of constructed tree: " + root.data);
        sc.close();
    }
}
