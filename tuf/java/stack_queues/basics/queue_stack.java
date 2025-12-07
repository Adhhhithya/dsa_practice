import java.util.Stack;
public class queue_stack {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public queue_stack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void enqueue(int x){  //push
        System.out.println("Enqueue :"+x);
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int dequeue(){  //pop
        if(s1.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return s1.pop();    
    }

    public int front(){  //top
        if(s1.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return s1.peek();
    }

    public boolean isEmpty(){
        return s1.isEmpty();
    }
    public int size(){
        return s1.size();
    }
    public void printQueue(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Queue from front to rear :");
        for(Integer item=s1.size()-1;item>=0;item--){
            System.out.println(s1.get(item));
        }
    }
    public static void main(String[] args) {
        queue_stack queue = new queue_stack();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Dequeue :"+queue.dequeue());
        System.out.println("Front :"+queue.front());
        queue.enqueue(5);
        queue.printQueue();
        System.out.println("Size :"+queue.size());
    }
}
    