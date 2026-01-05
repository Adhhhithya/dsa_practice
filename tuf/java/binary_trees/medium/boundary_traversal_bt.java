import java.util.*;
public class boundary_traversal_bt {
    public static boolean isLeaf(Node root){
        return root.left==null && root.right==null;
    }
    public static void add_left_boundary(Node root, List<Integer> res){
        Node curr = root.left;
        while(curr!=null){
            if(!isLeaf(curr)){
                res.add(curr.data);
            }
            if(curr.left!=null){
                curr=curr.left;
            }else{
                curr=curr.right;
            }
        }
    }
    public static void add_right_boundary(Node root , List<Integer> res){
        Node curr = root.right;
        List<Integer> temp = new ArrayList<>();
        while(curr!=null){
            if(!isLeaf(curr)){
                temp.add(curr.data);
            }
            if(curr.right!=null){
                curr = curr.right;
            }else{
                curr=curr.left;
            }
        }
        for(int i=temp.size()-1;i>=0;i--){
            res.add(temp.get(i));
        }
    }

    public static void add_leaves(Node root, List<Integer> res){
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }
        if(root.left!=null){
            add_leaves(root.left,res);
        }
        if(root.right!=null){
            add_leaves(root.right,res);
        }
    }

    public static List<Integer> boundary_traversal(Node root){
        List<Integer> res = new ArrayList<>();
        if(root==null) return res;
        if(!isLeaf(root)){
            res.add(root.data);
        }
        add_left_boundary(root, res);
        add_leaves(root, res);
        add_right_boundary(root, res);
        return res;
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(8);

        List<Integer> result = boundary_traversal(root);
        System.out.println("The Boundary Traversal of the Binary Tree is: " + result);
    }

}
