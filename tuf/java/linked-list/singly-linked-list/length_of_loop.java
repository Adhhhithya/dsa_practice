class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data=data1;
        this.next= next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class length_of_loop {
    // private static Node convertArr2L(int arr[]){
    //     Node head = new Node(arr[0]);
    //     Node mover=head;
    //     for(int i=1;i<arr.length;i++){
    //         Node temp = new Node(arr[i]);
    //         mover.next=temp;
    //         mover=temp;
    //     }
    //     return head;
    // }
    private static int find_length_of_loop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return calculate_length(slow,fast);
            }
        }
        return 0;
    }
    private static int calculate_length(Node slow,Node fast){
        int cnt=1;
        fast=fast.next;
        while(slow!=fast){
            cnt++;
            fast=fast.next;
        }
        return cnt;
    }
    public static void main(String args[]){
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eighth = new Node(8);

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;
        seventh.next=eighth;
        eighth.next=second;//creating loop

        int length = find_length_of_loop(head);
        if(length>0){
            System.out.println("Length of loop is: " + length);
        } else {
            System.out.println("No loop detected.");
        }
    }
}
