class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class floor_ceil_bst {
    public static int floor_bst(Node root , int key){
        int floor = -1;
        while(root!=null){
            if(root.data==key){
                floor=root.data;
                return floor;
            }
            if(key > root.data){
                floor=root.data;
                root=root.right;
            }else{
                root=root.left;
            }
        }
        return floor;
    }
    public static int ceil_bst(Node root,int key){
        int ceil = -1;
        while(root!=null){
            if(root.data==key){
                ceil = root.data;
                return ceil;
            }
            if(key < root.data){
                ceil = root.data;
                root=root.left;
            }else{
                root=root.right;
            }
        }
        return ceil;
    }
    public static void main(String[] args){
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(12);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.right.left = new Node(10);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        int key = 11;
        System.out.println("Floor of " + key + " in BST: " + floor_bst(root, key));
        System.out.println("Ceil of " + key + " in BST: " + ceil_bst(root, key));
    }
}
