import java.util.*;

public class zig_zag_traversal {
    public static List<List<Integer>> zig_zag(Node root){
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int size = q.size();
            Integer[] sub_list = new Integer[size];
            for(int i=0;i<size;i++){
                Node node = q.poll();
                int idx = flag ? i :(size-1-i);
                sub_list[idx] = node.data;

                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            flag = !flag;
            result.add(Arrays.asList(sub_list));
        }
        return result;
    }

    public static void main(String[] args){
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        node.left.left.left = new Node(8);
        node.left.left.right = new Node(9);

        List<List<Integer>> result = zig_zag(node);
        System.out.print("The Zig-Zag Level Order Traversal of Binary Tree : "+result);
    }
}
