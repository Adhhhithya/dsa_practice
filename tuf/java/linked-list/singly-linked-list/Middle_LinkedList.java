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
public class Middle_LinkedList {
    private static Node convertArr2LL(int arr[]){
        Node head= new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        Node head = convertArr2LL(arr);
        Node middle = findMiddle(head);
        System.out.println("Middle element is: " + middle.data);

    }
}
