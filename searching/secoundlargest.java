import java.util.*;
public class secoundlargest {
    public static int secgreater(int[] arr){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secoundlargestelm = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++){
            if(arr[i]>largest){
                secoundlargestelm = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>secoundlargestelm){
                secoundlargestelm = arr[i];
            }
        }
        return secoundlargestelm;
    }
    public static void main(String[] args){
        int arr[] = {2, 4, 7, 10, 67, 80};
        System.out.println(secgreater(arr));
    }
    
}
