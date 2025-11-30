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
public class check_palindrome {
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
    private static Node reverse(Node head){
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            Node front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    private static boolean isPalindrome(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node newHead = reverse(slow.next);
        Node first = head;
        Node second = newHead;
        while(second!=null){
            if(first.data!=second.data){
                reverse(newHead);
                return false;
            }
            first=first.next;
            second = second.next;
        }
        reverse(newHead);
        return true;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,2,3};
        Node head = convertArr2LL(arr);
        boolean ans = isPalindrome(head);
        if(ans){
            System.out.println("The linked list is a palindrome");
        } else {
            System.out.println("The linked list is not a palindrome");
        }
    }
}
