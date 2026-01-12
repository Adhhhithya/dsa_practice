//Constructing a binary tree from preorder and inorder traversal
import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class construct_bt_preorder_inorder {
    public Node buildTree(int[] preorder,int[] inorder){
        Map<Integer,Integer> inorder_map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inorder_map.put(inorder[i],i);
        }
        Node root = buildTree(preorder,0,preorder.length-1,
                inorder,0,inorder.length-1,inorder_map);
        return root;
    }
    private Node buildTree(int[] preorder,int pre_start,int pre_end,
                            int[] inorder,int in_start, int in_end,
                            Map<Integer,Integer> inorder_map){
        if(pre_start > pre_end || in_start > in_end){
            return null;
        }
        Node root = new Node(preorder[pre_start]);
        int in_root = inorder_map.get(root.data);
        int nums_left = in_root - in_start;
        root.left = buildTree(preorder,pre_start+1,pre_start+nums_left,
                inorder,in_start,in_root-1,inorder_map);
        root.right = buildTree(preorder,pre_start+nums_left+1,pre_end,
                inorder,in_root+1,in_end,inorder_map);
        return root;
    }
    public static void main(String[] args) {
        construct_bt_preorder_inorder obj = new construct_bt_preorder_inorder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter preorder traversal:");
        int[] preorder = new int[n];
        for(int i=0;i<n;i++){
            preorder[i]=sc.nextInt();
        }
        System.out.println("Enter inorder traversal:");
        int[] inorder = new int[n];
        for(int i=0;i<n;i++){
            inorder[i]=sc.nextInt();
        }
        Node root = obj.buildTree(preorder,inorder);
        System.out.println("Root of constructed tree: " + root.data);
    }
}
