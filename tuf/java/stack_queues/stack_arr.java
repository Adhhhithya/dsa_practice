public class stack_arr {
    private int[] stackArray;
    private int capacity;
    private int top;

    public stack_arr(int size){
        capacity = size;
        stackArray = new int[capacity];
        top=-1;
    }
    public stack_arr(){
        this(1000);
    }
    public void push(int x){
        if(top >= capacity-1){
            System.out.println("Stack Overflow");
            return;
        }
        System.out.println("Push :"+x);
        top=top+1;
        stackArray[top]=x;
    }
    public int pop(){
        if(top <0){
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = stackArray[top--];
        return val;
    }
    public int top(){
        if(top<0){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stackArray[top];
    }
    public int size(){
        return top+1;
    }
    public void printStack(){
        if(top<0){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack from top to bottom :");
        for(int i=top;i>=0;i--){
            System.out.println(stackArray[i]);
        }
    }
    public static void main(String[] args) {
        stack_arr stack = new stack_arr();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Top :"+stack.top());
        System.out.println("Pop :"+stack.pop());
        System.out.println("Top :"+stack.top());
        stack.push(5);
        stack.printStack();
        System.out.println("Size of stack: "+stack.size());
    }
}
