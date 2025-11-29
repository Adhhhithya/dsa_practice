class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class Reverse_linkedlist {
    private static Node convertArr2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }
    private static Node reverse_ll_iterative(Node head){
        Node temp = head;
        Node prev=null;
        while(temp!=null){
            Node front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    private static Node reverse_ll_recursive(Node head){
        if(head==null || head.next==null) return head;
        Node newHead= reverse_ll_recursive(head.next);
        Node front = head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
    public static void main(String args[]){
        int arr[]= {1,2,3,4,5};
        Node head= convertArr2LL(arr);
        head= reverse_ll_recursive(head);
        System.out.println("Reversed linked list : ");
        for(Node temp = head;temp!=null;temp=temp.next){
            System.out.print(temp.data+" ");
        }
    }

}
