import java.util.*;
public class implement_min_heap {
    private List<Integer> arr;
    private int cnt;
    public implement_min_heap(){
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
        if(newVal<oldVal){
            heapify_up(arr,ind);
        }else{
            heapify_down(arr,ind);
        }
    }

    public int extractMin(){
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

    public int getMin(){
        return arr.get(0);
    }

    public int heapSize(){
        return cnt;
    }

    private void heapify_down(List<Integer> arr , int ind){
        int smallest = ind;
        int l_child = 2*ind+1;
        int r_child = 2*ind+2;

        if(l_child < cnt && arr.get(l_child)<arr.get(smallest)){
            smallest=l_child;
        }
        if(r_child < cnt && arr.get(r_child)<arr.get(smallest)){
            smallest = r_child;
        }
        if(smallest!=ind){
            int temp = arr.get(ind);
            arr.set(ind,arr.get(smallest));
            arr.set(smallest,temp);
            heapify_down(arr, smallest);
        }
    }
    
    private void heapify_up(List<Integer> arr , int ind){
        int parent = (ind-1)/2;
        if(ind > 0 && arr.get(ind)<arr.get(parent)){
            int temp = arr.get(ind);
            arr.set(ind,arr.get(parent));
            arr.set(parent,temp);
            heapify_up(arr,parent);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        implement_min_heap minHeap = new implement_min_heap();
        minHeap.insert(3);
        minHeap.insert(1);
        minHeap.insert(5);
        System.out.println(minHeap.getMin()); // Output: 1
        minHeap.changeKey(2, 0);
        System.out.println(minHeap.getMin()); // Output: 0
        System.out.println(minHeap.extractMin()); // Output: 0
        System.out.println(minHeap.getMin()); // Output: 1
        sc.close();
    }


}
