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
public class start_node_loop {
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
    private static Node find_start_node_of_loop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        Node head=convertArr2LL(arr);
        //creating a loop
        Node temp = head;
        Node loopNode = null;
        while (temp.next != null) {
            if (temp.data == 3) loopNode = temp;
            temp = temp.next;
        }
        temp.next = loopNode;
        Node startNode = find_start_node_of_loop(head);
        if (startNode != null) {
            System.out.println("Start node of loop is: " + startNode.data);
        } else {
            System.out.println("No loop detected.");
        }
    }
}
