public class third_largest_element {

    public static int third(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secoundlargest = Integer.MIN_VALUE;
        int thirdlargest = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                thirdlargest = secoundlargest;
                secoundlargest = largest;
                largest = arr[i];
            }else if(arr[i] > secoundlargest && arr[i] != largest){
                thirdlargest = secoundlargest;
                secoundlargest = arr[i];
            }else if(arr[i] > thirdlargest && arr[i] != secoundlargest){
                thirdlargest = arr[i]
            ;            }
        }
        return thirdlargest;
    }

    public static void main(String[] args){
        int arr[] = {3,5,6,7};

        System.out.println("third largest element in array: " + third(arr));
    }
    
}
