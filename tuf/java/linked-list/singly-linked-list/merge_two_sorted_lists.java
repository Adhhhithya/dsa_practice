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
public class merge_two_sorted_lists {
    private static Node convertArr2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node mergeTwoSortedLists(Node list1, Node list2){
        if(list1==null) return list2;
        if(list2==null) return list1;

        if(list1.data<=list2.data){
            list1.next= mergeTwoSortedLists(list1.next, list2);
            return list1;
        }else{
            list2.next = mergeTwoSortedLists(list2.next, list1);
            return list2;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in first linked list:");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter elements of first linked list in sorted order:");
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        Node list1 = convertArr2LL(arr1);
        System.out.println("Enter number of elements in second linked list:");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter elements of second linked list in sorted order:");
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        Node list2 = convertArr2LL(arr2);
        Node mergedList = mergeTwoSortedLists(list1, list2);
        System.out.println("Merged Sorted Linked List:");
        for(Node temp=mergedList;temp!=null;temp=temp.next){
            System.out.print(temp.data+" ");
        }
    }
}
