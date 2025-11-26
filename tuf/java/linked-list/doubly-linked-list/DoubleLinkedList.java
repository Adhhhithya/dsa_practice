class Node {
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
public class DoubleLinkedList {
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

    //delete head of doubly linked list
    private static Node deleteHead(Node head){
        if(head==null || head.next==null) return null;
        Node prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;
        return head;
    }

    //delete tail of doubly linked list
    private static Node deleteTail(Node head){
        if(head==null||head.next==null) return null;
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        Node prev =tail.back;
        prev.next=null;
        tail.back=null;
        return head;
    }

    //delete Kth node of doubly linked list
    private static Node deleteKthNode(Node head,int k){
        if(head==null) return null;
        Node temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt==k) break;
            temp=temp.next;
        }
        if(temp==null) return head;
        Node prev = temp.back;
        Node front = temp.next;

        if(prev==null && front==null){
            return null;
        }else if(prev==null){
            return deleteHead(head);
        }else if(front==null){
            return deleteTail(head);
        }
        prev.next=front;
        front.back=prev;
        temp.next=null;
        temp.back=null;
        return head;
    }
    public static void main(String[] args){
        int arr[]={12,5,6,8,9};
        Node head = convertArr2DLL(arr);
        head = deleteKthNode(head,4);
        for(Node temp = head; temp!=null; temp=temp.next){
            System.out.print(temp.data + " ");
        }
    }
}
