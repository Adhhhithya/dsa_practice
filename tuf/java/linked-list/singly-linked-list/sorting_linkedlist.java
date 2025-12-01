class Node{
    int data;
    Node next ;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class sorting_linkedlist {
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
    private static Node merge_sorted_list(Node list1, Node list2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        while(list1!=null && list2!=null){
            if(list1.data <= list2.data){
                temp.next=list1;
                list1=list1.next;
            }else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null){
            temp.next=list1;
        }else{
            temp.next=list2;
        }
        return dummy.next;

    }
    private static Node find_middle(Node head){
        if(head ==null || head.next==null) return head;
        Node slow = head;
        Node fast=head.next;
        while(fast!= null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private static Node sort_linked_list(Node head){
        if(head==null || head.next==null) return head;
        Node mid = find_middle(head);
        Node right = mid.next;
        mid.next=null;
        Node left = head;
        
        left = sort_linked_list(left);
        right = sort_linked_list(right);
        return merge_sorted_list(left, right);
    }
    public static void main(String args[]){
        int arr[]={9,5,8,6,2,3,4,1,7};
        Node head = convertArr2LL(arr);             // pass array, not head
        head = sort_linked_list(head);              // assign returned sorted head
        for(Node temp = head;temp!=null;temp=temp.next){
            System.out.print(temp.data+" ");
        }
        System.out.println();
        
    }

}
