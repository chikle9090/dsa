import java.util.*;
public class largest_element {

    public static int findlargest(int arr[]){
        int max = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = {2,6,8,4,9,10};
        Arrays.sort(arr);
        System.out.print("largest elemint in arrya is: " + findlargest(arr));
    }
    
}
