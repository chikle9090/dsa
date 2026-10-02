import java.util.*;
public class thirdlargest {
    public static int thirdelm(int[] arr){
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        int secound = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            if(arr[i]>first){
                third = secound;
                secound = first;
                first = arr[i];
            }else if(arr[i]>secound && arr[i] != first){
                third = secound;
                secound = arr[i];
            }else if(arr[i]>third && arr[i] != secound && arr[i] != first){
                third = arr[i];
            }
        }
        return third;
    }
    public static void main(String[] args){
        int arr[] = {2,6,4,5,30,78,90};
        System.out.println(thirdelm(arr));
    }
    
}
