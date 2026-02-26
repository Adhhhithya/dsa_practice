import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class add_two_nos{
    public static Node add(Node head1, Node head2){
        Node t1 = head1;
        Node t2 = head2;
        Node dummy = new Node(-1);
        Node curr = dummy;
        int carry =0;

        while(t1!=null && t2!=null){
            int sum = carry;
            if(t1!=null){
                sum+=t1.data;
                t1=t1.next;
            }
            if(t2!=null){
                sum+=t2.data;
                t2=t2.next;
            }
            Node new_node = new Node(sum%10);
            carry = sum/10;
            curr.next = new_node;
            curr = new_node;
        }
        if(carry!=0){
            Node new_node = new Node(carry);
            curr.next = new_node;
        }
        return dummy.next;
    }
    public static Node arr_to_ll(int arr[]){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++){
            Node new_node = new Node(arr[i]);
            temp.next = new_node;
            temp = new_node;
        }
        return head;
    }
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter size of second number: ");
        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        System.out.println("Enter digits of first number: ");
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter digits of second number: ");
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        Node head1 = arr_to_ll(arr1);
        Node head2 = arr_to_ll(arr2);
        Node result = add(head1, head2);
        System.out.println("Sum of the two numbers is: ");
        print(result);

    }
}