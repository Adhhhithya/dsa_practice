import java.util.Stack;
public class min_stack {
    private Stack<Integer> st;
    private int mini;
    
    public min_stack(){
        st = new Stack<>();
        mini = Integer.MAX_VALUE;
    }

    public void push(int val){
        if(st.isEmpty()){
            st.push(val);
            mini = val;
        } else if(val >= mini){
            st.push(val);
        } else {
            st.push(2*val - mini);
            mini = val;
        }
    }

    public void pop(){
        if(st.isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        int x = st.pop();
        if(x < mini){
            mini = 2*mini - x;
        }
    }

    public int top(){
        if(st.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        int x = st.peek();
        if(x >= mini){
            return x;
        } else {
            return mini;
        }
    }
    public int getMin(){
        return mini;
    }

    public static void main(String[] args) {
        min_stack ms = new min_stack();
        ms.push(3);
        System.out.println("Top :"+ms.top()+" Min :"+ms.getMin());
        ms.push(5);
        System.out.println("Top :"+ms.top()+" Min :"+ms.getMin());
        ms.push(2);
        System.out.println("Top :"+ms.top()+" Min :"+ms.getMin());
        ms.push(1);
        System.out.println("Top :"+ms.top()+" Min :"+ms.getMin());
        ms.pop();
        System.out.println("Top :"+ms.top()+" Min :"+ms.getMin());
        ms.pop();
        System.out.println("Top :"+ms.top()+" Min :"+ms.getMin());
    }
}
