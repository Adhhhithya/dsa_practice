class Node{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
public class bst_from_preorder {
    public static Node bstFromPreorder(int[] preorder) {
        return constructBST(preorder, Integer.MAX_VALUE, new int[]{0});
    }
    private static Node constructBST(int[] preorder, int bound, int[] i) {
        if (i[0] == preorder.length || preorder[i[0]] > bound) {
            return null;
        }
        Node root = new Node(preorder[i[0]]);
        i[0]++;
        root.left = constructBST(preorder, root.data, i);
        root.right = constructBST(preorder, bound, i);
        return root;
    }
    public static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }
    public static void main(String[] args) {
        int[] preorder = {8, 5, 1, 7, 10, 12};
        Node root = bstFromPreorder(preorder);
        System.out.println("Inorder Traversal of the constructed BST:");
        inorderTraversal(root);
    }
}
