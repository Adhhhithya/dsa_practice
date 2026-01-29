import java.util.*;
public class implement_max_heap {
    private List<Integer> arr;
    private int cnt;
    public implement_max_heap(){
        arr = new ArrayList<>();
        cnt =0;
    }
    public void initialize_heap(){
        arr.clear();
        cnt =0;
    }
    public void insert(int key){
        arr.add(key);
        cnt++;
        heapify_up(arr,cnt-1);
    }
    public void changeKey(int ind , int newVal){
        if(ind<0 || ind>=cnt)return;
        int oldVal = arr.get(ind);
        arr.set(ind,newVal);
        if(newVal>oldVal){
            heapify_up(arr,ind);
        }else{
            heapify_down(arr,ind);
        }
    }
    public int extractMax(){
        if(cnt==0) return -1;
        int temp = arr.get(0);
        arr.set(0,arr.get(cnt-1));
        arr.set(cnt-1,temp);
        arr.remove(cnt-1);
        cnt--;
        if(cnt>0){
            heapify_down(arr,0);
        }
        return temp;
    }
    public boolean isEmpty(){
        return cnt==0;
    }
    public int getMax(){
        return arr.get(0);
    }
    public int heapSize(){
        return cnt;
    }
    private void heapify_down(List<Integer> arr , int ind){
        int largest = ind;
        int l_child = 2*ind+1;
        int r_child = 2*ind+2;
        if(l_child<cnt && arr.get(l_child)>arr.get(largest)){
            largest = l_child;
        }
        if(r_child<cnt && arr.get(r_child)>arr.get(largest)){
            largest = r_child;
        }
        if(largest!=ind){
            int temp = arr.get(ind);
            arr.set(ind,arr.get(largest));
            arr.set(largest,temp);
            heapify_down(arr,largest);
        }
    }
    private void heapify_up(List<Integer> arr , int ind){
        if(ind==0) return;
        int parent = (ind-1)/2;
        if(arr.get(parent)<arr.get(ind)){
            int temp = arr.get(parent);
            arr.set(parent,arr.get(ind));
            arr.set(ind,temp);
            heapify_up(arr,parent);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        implement_max_heap maxHeap = new implement_max_heap();
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(5);
        System.out.println("Max Element: " + maxHeap.getMax()); // Should print 20
        System.out.println("Extracted Max: " + maxHeap.extractMax()); // Should print
        System.out.println("New Max Element: " + maxHeap.getMax()); // Should print 10
        maxHeap.changeKey(1, 15); // Change index 1 value to 15
        System.out.println("Max Element after changeKey: " + maxHeap.getMax()); // Should print 15
        maxHeap.insert(30);
        System.out.println("Max Element after inserting 30: " + maxHeap.getMax()); // Should print 30
        sc.close();
    }
    
}
