import java.util.*;

public class Find_Element_in_Infinite_Sorted_Array {
public static void main(String[] args) {
      int arr[] = new int[]{10,12,14,16,18,20,33,55,66,67,70,80,90};
      int ele = 12;
      int ans = searchInfinite(arr,ele);   
      System.out.println(ans);
    }
    static int searchInfinite(int arr[], int key){
        int low = 0;
        int high = 1;
        while(arr[high] < key){
            low = high;
            high = 2 * high;
        }
        return BinarySearch(arr, low, high, key);
    } 

    public static int BinarySearch(int arr[], int low, int high, int key){
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(key < arr[mid]){
                high = mid-1;
            }
            else if(key > arr[mid]){
                low = mid+1;
            }
        }
        return -1;
    }
}







