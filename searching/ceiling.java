import java.util.*;
public class ceiling {
    public static int key(int[] arr,int x){
        int left = 0;
        int right = arr.length-1;
        int res = -1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]<x){
                left = mid+1;
            }else{
                res = mid;
                right = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        Arrays.sort(arr);
        int x = 3;
        int result = key(arr,x);
        if(result == -1){
            System.out.println("ceiling of "+ x +" doesn't exist");
        }else{
            System.out.println("ceiling of "+ x +" is "+ arr[result]);
        }
    }
    
}
