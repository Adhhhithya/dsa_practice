import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Pair{
    Node node;
    int hd;
    Pair(Node node, int hd){
        this.node=node;
        this.hd=hd;
    }
}
public class top_view_bt {
    public static List<Integer> top_view(Node root){
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));

        while(!q.isEmpty()){
            Pair it = q.poll();
            Node temp = it.node;
            int hd = it.hd;

            if(map.get(hd)==null){
                map.put(hd,temp.data);
            }
            if(temp.left!=null){
                q.add(new Pair(temp.left, hd-1));
            }
            if(temp.right!=null){
                q.add(new Pair(temp.right , hd+1));
            }
        }
        for(int values : map.values()){
            ans.add(values);
        }
        return ans;
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.left.right.left = new Node(6);

        List<Integer> res = top_view(root);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}
