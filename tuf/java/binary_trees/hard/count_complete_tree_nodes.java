class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class count_complete_tree_nodes {
    public int count_nodes(Node root){
        if(root==null) return 0;
        int left_height = get_left_height(root);
        int right_height = get_right_height(root);
        if(left_height==right_height){
            return (2<<left_height)-1;
        }
        else{
            return 1 + count_nodes(root.left) + count_nodes(root.right);
        }
    }
    public int get_left_height(Node root){
        int cnt =0;
        while(root.left!=null){
            cnt++;
            root=root.left;
        }
        return cnt;
    }
    public int get_right_height(Node root){
        int cnt=0;
        while(root.right!=null){
            cnt++;
            root=root.right;
        }
        return cnt;
    }
    public static void main(String[] args){
        count_complete_tree_nodes obj = new count_complete_tree_nodes();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        System.out.println("Number of nodes in complete binary tree: "+obj.count_nodes(root));
    }
}
