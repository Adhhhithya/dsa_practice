public class representation {
    class Node{
        int data;
        Node left, right;
        public Node(int item){
            this.data=item;
            left=right=null;
        }
    }
    public static void main(String[] args) {
        System.out.println("Binary Tree Representation");
        representation tree = new representation();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
    }
}
