import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class merge_k_sorted_lists {
    public static Node mergeKsortedLists(Node lists[]){
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)-> a.data-b.data);
        for(Node head:lists){
            if(head!=null){
                pq.add(head);
            }
        }
        Node dummy = new Node(0);
        Node tail = dummy;
        while(!pq.isEmpty()){
            Node small = pq.poll();
            tail.next = small;
            tail = tail.next;
            if(small.next!=null){
                pq.add(small.next);
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node list1 = new Node(1, new Node(4, new Node(7,new Node(10))));
        Node list2 = new Node(2, new Node(5, new Node(8)));
        Node list3 = new Node(3, new Node(6, new Node(9)));
        Node lists[] = {list1, list2, list3};
        Node mergedHead = mergeKsortedLists(lists);
        for(Node temp=mergedHead; temp!=null; temp=temp.next){
            System.out.print(temp.data + " ");
        }
    }
}
