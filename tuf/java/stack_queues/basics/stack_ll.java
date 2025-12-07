class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data = data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class stack_ll {
    private Node top;
    private int size;

    public stack_ll(){
        this.top=null;
        this.size=0;
    }

    public void push(int x){
        System.out.println("Push :"+x);
        Node temp = new Node(x);
        temp.next=top;
        top=temp;
        size++;
    }

    public int pop(){
        if(top==null){
            System.out.println("Stack Underflow");
            return -1;
        }
        Node temp = top;
        top=top.next;
        size--;
        return temp.data;
    }

    public int top(){
        if(top==null){
            System.out.println("Stack Underflow");
            return -1;
        }
        return top.data;
    }

    public int size(){
        return size;
    }

    public void printStack(){
        if(top==null){
            System.out.println("Stack is Empty");
        }
        Node temp = top;
        System.out.println("Stack from top to bottom :");
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        stack_ll stack = new stack_ll();
        stack.push(4);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        System.out.println("Top :"+stack.top());
        System.out.println("Pop :"+stack.pop());
        stack.push(7);
        stack.printStack();
        System.out.println("Size :"+stack.size());
    }
}
