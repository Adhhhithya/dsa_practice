import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class serialize_deserialize_bt {
    public String serialize(Node root){
        if(root==null) return "";
        Queue<Node> q = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr==null){
                res.append("n ");
                continue;
            }
            res.append(curr.data+" ");
            q.add(curr.left);
            q.add(curr.right);
        }
        return res.toString();
    }
    public Node deserialize(String data){
        if(data==""||data.isEmpty()) return null;
        String[] values = data.split(" ");
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(Integer.parseInt(values[0]));
        q.add(root);
        int i=1;
        while(i<values.length && !q.isEmpty()){
            Node parent = q.poll();
            if(!values[i].equals("n")){
                Node left = new Node(Integer.parseInt(values[i]));
                parent.left = left;
                q.add(left);
            }
            i++;
            if(i<values.length && !values[i].equals("n")){
                Node right = new Node(Integer.parseInt(values[i]));
                parent.right=right;
                q.add(right);
            }
            i++;
        }
        return root;
    }
    public static void main(String[] args){
        serialize_deserialize_bt obj = new serialize_deserialize_bt();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        String serialized = obj.serialize(root);
        System.out.println("Serialized tree: " + serialized);
        Node deserialized_root = obj.deserialize(serialized);
        System.out.println("Deserialized tree root: " + deserialized_root.data);
    }
}
