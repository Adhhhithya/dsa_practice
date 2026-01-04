public class identical_trees {
    public static boolean identical(Node p,Node q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.data != q.data) return false;
        if(p.data == q.data){
            return identical(p.left, q.left) && identical(p.right, q.right);
        }
        return true;
    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);

        boolean result = identical(root1, root2);
        if(result){
            System.out.println("The two binary trees are identical.");
        } else {
            System.out.println("The two binary trees are not identical.");
        }
    }
}
