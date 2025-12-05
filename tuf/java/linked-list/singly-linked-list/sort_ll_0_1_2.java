class Node{
    int data;
    Node next;
    Node(int data1 , Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class sort_ll_0_1_2 {
    private static Node sort_linkedlist(Node head){

    //Optimal Approach : Using 3 dummy nodes O(N)
        if(head == null || head.next==null) return head;
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node temp = head;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }
            else if(temp.data==1){
                one.next= temp;
                one=one.next;
            }
            else{
                two.next=temp;
                two = two.next;
            }
            temp=temp.next;
        }
        zero.next = (oneHead.next !=null) ? oneHead.next : twoHead.next;
        one.next= twoHead.next;
        two.next=null;

        Node newHead = zeroHead.next;
        return newHead;


        // Brute Force : o(2N)
        // Node temp = head;
        // int cnt0=0;
        // int cnt1=0;
        // int cnt2=0;
        // while(temp!=null){
        //     if(temp.data==0){
        //         cnt0++;
        //     }else if(temp.data==1){
        //         cnt1++;
        //     }else{
        //         cnt2++;
        //     }
        //     temp = temp.next;
        // }
        // temp = head;
        // while(cnt0>0){
        //     temp.data=0;
        //     cnt0--;
        //     temp=temp.next;
        // }
        // while(cnt1>0){
        //     temp.data =1;
        //     cnt1--;
        //     temp=temp.next;
        // }
        // while(cnt2>0){
        //     temp.data=2;
        //     cnt2--;
        //     temp=temp.next;
        // }
        // return head;
    }
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

    public static void main(String[] args){
        int arr[]={1,2,0,1,2,0,1,0,2,1,0};
        Node head = convertArr2LL(arr);
        head = sort_linkedlist(head);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
