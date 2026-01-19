import java.util.Stack;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
class BSTIterator {
    private Stack<Node> stack = new Stack<>();
    public BSTIterator(Node root) {
        pushAllLeft(root);
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
        Node node = stack.pop();
        if (node.right != null) {
            pushAllLeft(node.right);
        }
        return node.data;
    }

    private void pushAllLeft(Node node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}


public class bst_iterator {
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(7);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        root.left.left.left = new Node(1);
        root.left.right.left = new Node(5);
        root.left.right.left.left = new Node(4);
        root.right.left = new Node(9);
        root.right.left.left = new Node(8);

        System.out.print("Recursive Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("BST Iterator Output: ");
        BSTIterator iterator = new BSTIterator(root);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}