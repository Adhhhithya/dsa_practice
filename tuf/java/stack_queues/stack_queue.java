import java.util.LinkedList;
import java.util.Queue;
public class stack_queue {
    private Queue<Integer> q;
    
    public stack_queue(){
        q = new LinkedList<>();
    }

    public void push(int x){
        System.out.println("Push :"+x);
        int s = q.size();
        q.add(x);
        for(int i=0;i<s;i++){
            q.add(q.poll());
        }
    }

    public int pop(){
        if(q.isEmpty()){
            System.out.println("Queue Underflow");
            return -1;
        }
        int n = q.peek();
        q.poll();
        return n;
    }

    public int top(){
        if(q.isEmpty()){
            System.out.println("Queue Underflow");
            return -1;
        }
        return q.peek();
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }

    public int size(){
        return q.size();
    }

    public void printStack(){
        if(q.isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack from top to bottom :");
        for(Integer item : q){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        stack_queue stack = new stack_queue();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Top :"+stack.top());
        System.out.println("Pop :"+stack.pop());
        System.out.println("Top :"+stack.top());
        stack.push(5);
        System.out.println("Top :"+stack.top());
        stack.printStack();
        System.out.println("Size:"+stack.size());
    }
}
