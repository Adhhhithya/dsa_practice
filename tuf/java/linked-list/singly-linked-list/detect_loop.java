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
public class detect_loop{
    private static Node convertArr2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static boolean has_loop(Node head){
        Node slow = head;
        Node fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        Node head = convertArr2LL(arr);
        System.out.println("Has loop (before): " + has_loop(head)); 

        //creating a loop
        Node temp = head;
        Node loopNode = null;
        while (temp.next != null) {
            if (temp.data == 3) loopNode = temp;
            temp = temp.next;
        }
        temp.next = loopNode;
        System.out.println("Has loop (after): " + has_loop(head));

    }

}