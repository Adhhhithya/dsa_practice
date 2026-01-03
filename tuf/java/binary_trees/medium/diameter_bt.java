class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
public class diameter_bt {
    public int diameter(Node root){
        int[] dia = new int[1];
        height(root,dia);
        return dia[0];
    }
    public int height(Node root, int[] dia){
        if(root==null){
            return 0;
        }
        int lh = height(root.left,dia);
        int rh = height(root.right,dia);
        dia[0] = Math.max(dia[0], lh + rh);
        return Math.max(lh, rh) + 1;
    }
    public static void main(String[] args){
        diameter_bt tree = new diameter_bt();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        int diameter = tree.diameter(root);
        System.out.println("The diameter of the binary tree is: " + diameter);
    }
}
