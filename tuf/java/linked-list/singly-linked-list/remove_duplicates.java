import java.util.HashSet;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
public class remove_duplicates {
    public static Node removeDuplicates(Node head){
        Node temp = head;
        Node prev = null;
        HashSet<Integer> set = new HashSet<>();
        while(temp!=null){
            if(set.contains(temp.data)){
                prev.next = temp.next;
            }else{
                set.add(temp.data);
                prev=temp;
            }
            temp = temp.next;
        }
        return head;
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
        System.out.println("Enter elements of linked list:");
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
