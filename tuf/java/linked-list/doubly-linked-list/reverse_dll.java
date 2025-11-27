class Node{
    int data;
    Node next;
    Node back;
    Node(int data1, Node next1, Node back1){
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
        this.back=null;
    }
}
public class reverse_dll {
    //convert array to doubly linked list
    private static Node convertArr2DLL(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    //Reversing a doubly linked list
    private static Node reverseDLL(Node head){
        if(head == null || head.next==null) return head;
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            prev=curr.back;
            curr.back=curr.next;
            curr.next=prev;
            curr=curr.back;
        }
        Node newHead = prev.back;
        return newHead;
    }
    public static void main(String[] args){
        int arr[]={12,5,6,8,9};
        Node head = convertArr2DLL(arr);
        head=reverseDLL(head);
        for(Node temp = head; temp!=null; temp=temp.next){
            System.out.print(temp.data + " ");
        }
    }
}
