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
public class LinkedList_operations {
    //Calculate length of linked list
    private static int lengthOfLL(Node head){
        int cnt=0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        return cnt;
    }
    //Convert array to linked list
    private static Node convertArr2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }

    //Delete head node of linked list
    private static Node removeHead(Node head){
        if (head ==null) return head;
        head = head.next;
        return head;
    }

    //Delete tail node of linked list
    private static Node removeTail(Node head){
        if(head==null || head.next==null) return null;
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    //Delete Kth node of linked list
    private static Node removeKthNode(Node head, int k){
        if(head == null) return null;
        if(k==1){
            Node temp =head;
            head=head.next;
            return head;
        }
        int cnt =0;
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    
    //Delete the node with given value
    private static Node removeEl(Node head, int el){
        if(head==null) return null;
        if(head.data==el){
            head=head.next;
            return head;
        }
        Node temp = head;
        Node prev=null;
        while(temp!=null){
            if(temp.data==el){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    //Insert Element at head of linked list
    private static Node insertHead(Node head, int val){
        Node temp = new Node(val,head);
        return temp;
    }

    //Insert Element ar Tail of linked list
    private static Node insertTail(Node head,int val){
        if(head==null) return new Node(val);
        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode = new Node(val);
        temp.next=newNode;
        return head;
    }

    //Insert Element at Kth position of linked list
    private static Node insertK(Node head, int el, int k){
        if(head==null){
            if(k==1){
                return new Node(el);
            }else{
                return null;
            }
        }
        if(k==1){
        Node temp = new Node(el,head);
        return temp;     
       }
       int cnt =0;
       Node temp = head;
       while(temp!=null){
        cnt++;
        if(cnt==k-1){
            Node x = new Node(el);
            x.next=temp.next;
            temp.next=x;
            break;
        }
        temp=temp.next;
       }
       return head;
    }

    //Insert Element before given value
    private static Node insertEl(Node head, int el,int val){
        if(head==null) return null;
        if(head.data==val){
            return new Node(el,head);
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==val){
                Node x = new Node(el,temp.next);
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
        return head;

    }
    public static void main(String[] args) {
        int [] arr ={12,5,6,8};
        Node head =convertArr2LL(arr);
        head = insertEl(head,100,8);
        int length = lengthOfLL(head);
        for(Node temp = head; temp!=null; temp=temp.next){
            System.out.print(temp.data + " ");
        }
    }
}
