public class check_arr_is_min_heap {
    public static boolean is_min_heap(int arr[]){
        int n = arr.length;
        for(int  i=(n/2)-1;i>=0;i--){
            int l_child = 2*i+1;
            int r_child = 2*i+2;
            if(l_child < n && arr[l_child]<arr[i]){
                return false;
            }
            if(r_child < n && arr[r_child]<arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr1[] = {1,3,2,7,6,4,5};
        int arr2[] = {3,5,8,10,15,12,18,20};
        System.out.println(is_min_heap(arr1)); 
        System.out.println(is_min_heap(arr2)); 
    }
}
