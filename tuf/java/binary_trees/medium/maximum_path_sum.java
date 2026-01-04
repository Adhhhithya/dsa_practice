public class maximum_path_sum {
    public static int maxPathsum(Node root){
        int max_val[] = new int[1];
        max_val[0] = Integer.MIN_VALUE;
        max_path_node(root,max_val);
        return max_val[0];
    }
    public static int max_path_node(Node root,int[] max_val){
        if(root==null){
            return 0;
        }
        int left_sum = Math.max(0,max_path_node(root.left, max_val));
        int right_sum = Math.max(0,max_path_node(root.right, max_val));
        max_val[0] = Math.max(max_val[0],left_sum+right_sum+root.data);
        return Math.max(left_sum,right_sum)+root.data;
    }
    public static void main(String[] args){
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        int result = maxPathsum(root);
        System.out.println("The maximum path sum is: " + result);
    }
}
