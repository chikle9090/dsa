public class secound_largest_element {

    public static int secound(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secoundlargest = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest){
                secoundlargest = largest;
                largest = arr[i];
            }else if(arr[i] > secoundlargest && arr[i] != largest){
                secoundlargest = arr[i];
            }
        }
        return secoundlargest;
    }
    public static void main(String[] args){
        int[] arr = {3,5,6,8,10};
        System.out.println("secound largest: " + secound(arr));
    }
}
