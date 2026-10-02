import java.util.*;
public class binarysearch {
    public static int search(int arr[],int target){
        int  start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid]==target)
                return mid;
            if(arr[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {2,6,7,4,10};
        int target = 7;
        Arrays.sort(arr);
        int result = search(arr,target);
        if(target==-1){
            System.out.println("target is not present");
        }else{
            System.out.println("index of target: " + result);
        }
    }
    
}
