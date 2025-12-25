import java.util.*;
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class level_order {
    public List<List<Integer>> level_order_traversal(Node root){
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if(root==null){
            return list;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> sub_list = new LinkedList<Integer>();
            for(int i=0;i<size;i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                sub_list.add(q.poll().data);
            }
            list.add(sub_list);
        }
        return list;
    }

    public static void main (String[] args){
        level_order tree = new level_order();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Level-order Traversal of Binary Tree:");
        List<List<Integer>> result = tree.level_order_traversal(root);
        for(List<Integer> level : result){
            System.out.println(level);
        }
    }
}
