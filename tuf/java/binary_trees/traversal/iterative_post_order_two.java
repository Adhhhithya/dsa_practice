import java.util.*;
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class iterative_post_order_two {
    public static List<Integer> post_order(Node root){
        List<Integer> postorder = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while(curr!=null || !st.isEmpty()){
            if(curr!=null){
                st.push(curr);
                curr=curr.left;
            }else{
                Node temp = st.peek().right;
                if(temp==null){
                    temp = st.pop();
                    postorder.add(temp.data);
                    while(!st.isEmpty() && temp == st.peek().right){
                        temp = st.pop();
                        postorder.add(temp.data);
                    }
                }else{
                    curr=temp;
                }
            }
        }
        return postorder;
    }
    public static void main(String[] args){
        iterative_post_order_two tree = new iterative_post_order_two();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Iterative Post-order Traversal of Binary Tree:");
        List<Integer> result = tree.post_order(root);
        System.out.println(result);
    }


}