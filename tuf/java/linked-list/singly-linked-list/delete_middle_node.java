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
public class delete_middle_node {
    private static Node delete_midlle_node(Node head){
        if(head==null || head.next==null) return null;
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;


    }
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
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        Node head = convertArr2LL(arr);
        delete_midlle_node(head);
        for(Node temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.data+" ");
        }
    }
}
