public class Node {
       int data;
       Node next;
       Node back;

    public Node(int data1, Node next1, Node back1){
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }
    public Node(int data1){
        this.data=data1;
        this.next=null;
        this.back=null;
    }
}
