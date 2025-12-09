// Remove th element from a  sorted singly linked list if it appears more than once in the list
import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
}
public class remove_duplicates_type2 {
    public static Node removeDuplicates(Node head){
        Node dummy = new Node(-1);
        dummy.next = head;
        Node prev = dummy;
        Node temp = head;

        while(temp!=null){
            while(temp.next!=null && temp.data==temp.next.data){
                temp = temp.next;
            }
            if(prev.next==temp){
                prev = prev.next;
            }else{
                prev.next=temp.next;
            }
            temp=temp.next;
        }
        return dummy.next;
    }

    public static Node convertArr2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in linked list:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of linked list in sorted order:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Node head = convertArr2LL(arr);
        head = removeDuplicates(head);
        System.out.println("Linked List after removing duplicates:");
        for(Node temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.data+" ");
        }
        sc.close();

    }
}
