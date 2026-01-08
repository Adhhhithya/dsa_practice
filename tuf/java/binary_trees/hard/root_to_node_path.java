import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class root_to_node_path {
    public static boolean get_path(Node root, List<Integer> ans,int x ){
        if(root==null) return false;
        ans.add(root.data);
        if(root.data==x) return true;
        if(get_path(root.left,ans,x)||get_path(root.right,ans,x)){
            return true;
        }
        ans.remove(ans.size()-1);
        return false;
    }
    public static List<Integer> root_to_node(Node root, int x){
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        get_path(root,ans,x);
        return ans;
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);
        int x = 7;
        List<Integer> res = root_to_node(root,x);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}
