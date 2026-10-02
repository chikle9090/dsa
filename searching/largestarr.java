public class largestarr{
    public static int greaternum(int[] arr){
        int max = arr[0];
       for(int i = 0;i<arr.length;i++){
         if(arr[i]>max)
            max = arr[i];

       }
       return max;
    }
    public static void main(String[] args){
        int arr[] = {2,10,15,20,40,55,3,4};
        System.out.println(greaternum(arr));
    }
}