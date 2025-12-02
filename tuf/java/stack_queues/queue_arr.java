public class queue_arr {
    private int[] queueArray;
    private int capacity;
    private int start ;
    private int end ;
    private int curr_size;
    
    public queue_arr(int size){
        capacity = size;
        queueArray = new int[capacity];
        start = -1;
        end =-1;
        curr_size=0;
    }
    public queue_arr(){
        this(1000);
    }

    public void enqueue(int x){ //push
        if(curr_size==capacity){
            System.out.println("Queue Overflow");
            return;
        }
        if(curr_size==0){
            start =0;
            end =0;
        }else{
            end = (end+1)%capacity;
        }
        queueArray[end]=x;
        curr_size++;
    }
    public int dequeue(){ //pop
        if(curr_size==0){
            System.out.println("Queue Underflow");
            return -1;
        }
        int ele = queueArray[start];
        if(curr_size==1){
            start=-1;
            end=-1;
        }
        else{
            start = (start+1)%capacity;
        }
        curr_size--;
        return ele;
    }
    public int front(){  //top
        if(curr_size==0){
            System.out.println("Queue Underflow");
            return -1;
        }
        return queueArray[start];
    }

    public int size(){
        return curr_size;
    }

    public void printQueue(){
        if(curr_size==0){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Queue from front to rear :");
        for(int i=0;i<curr_size;i++){
            System.out.println(queueArray[(start+i)%capacity]);
        }
    }
    public static void main(String[] args) {
        queue_arr queue = new queue_arr();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Front :"+queue.front());
        System.out.println("Dequeue :"+queue.dequeue());
        System.out.println("Front :"+queue.front());
        queue.enqueue(5);
        queue.printQueue();
        System.out.println("Size of queue: "+queue.size());
    }
}
