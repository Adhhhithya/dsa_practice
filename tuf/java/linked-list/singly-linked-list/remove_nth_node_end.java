public class remove_nth_node_end {
    private static Node remove_Nth_Node_from_end(Node head,int n){
        Node fast=head;
        Node slow = head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        Node delNode = slow.next;
        slow.next=slow.next.next;
        return head;
    }
    private static Node convertArr2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp =new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node head = convertArr2LL(arr);
        remove_Nth_Node_from_end(head, 2);
        for(Node temp = head;temp!=null;temp=temp.next){
            System.out.print(temp.data+" ");
        }
    }
}
