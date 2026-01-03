import java.util.*;
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data = data;
        left=right=null;
    }
}
class Pair{
    Node node;
    int num;
    public Pair(Node node,int num){
        this.node=node;
        this.num=num;
    }
}
public class pre_in_post_traversal {
    public static void pre_in_post(Node root){
        if(root==null){
            return;
        }
        Stack<Pair> st = new Stack<Pair>();
        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();
        st.push(new Pair(root,1));
        while(!st.isEmpty()){
            Pair it = st.pop();
            if(it.num==1){
                preorder.add(it.node.data);
                it.num++;
                st.push(it);

                if(it.node.left!=null){
                    st.push(new Pair(it.node.left,1));
                }
            }else if(it.num==2){
                inorder.add(it.node.data);
                it.num++;
                st.push(it);
                if(it.node.right!=null){
                    st.push(new Pair(it.node.right,1));
                }
            }else{
                postorder.add(it.node.data);
            }
        }
        System.out.println("Pre-order Traversal: "+preorder);
        System.out.println("In-order Traversal: "+inorder);
        System.out.println("Post-order Traversal: "+postorder);
    }
    public static void main(String[] args){
        pre_in_post_traversal tree = new pre_in_post_traversal();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Pre-order, In-order and Post-order Traversal of Binary Tree:");
        tree.pre_in_post(root);
    }
}
