class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class queue_ll {
    private Node start;
    private Node end;
    private int size;

    public queue_ll(){
        this.start=null;
        this.end=null;
        this.size=0;
    }

    public void enqueue(int x){  //push
        System.out.println("Enqueue :"+x);
        Node temp = new Node(x);
        if(start==null){
            start=temp;
            end=temp;
        }else{
            end.next=temp;
            end=temp;
        }
        size++;
    }

    public int dequeue(){  //pop
        if(start==null){
            System.out.println("Queue Underflow");
            return -1;
        }
        Node temp = start;
        start = start.next;
        size-=1;
        return temp.data;
    }

    public int front(){  //top
        if(start==null){
            System.out.println("Queue Underflow");
            return -1;
        }
        return start.data;
    }

    public int size(){
        return size;
    }

    public void printQueue(){
        if(start==null){
            System.out.println("Queue is Empty");
        }
        Node temp = start;
        System.out.println("Queue from front to rear :");
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        queue_ll queue = new queue_ll();
        queue.enqueue(7);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(5);
        System.out.println("Dequeue :"+queue.dequeue());
        System.out.println("Front :"+queue.front());
        System.out.println("Dequeue :"+queue.dequeue());
        System.out.println("Front :"+queue.front());
        queue.printQueue();
        System.out.println("Size :"+queue.size());

    }
}
