public class linearsearch{
    public static int search(int arr[], int target){
        for(int i = 0;i < arr.length;i++){
           if(arr[i] == target){
            return i;
           }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {2,3,5,10,9};
        int target = 1;

        int result = search(arr,target);
        if(result == -1){
            System.out.println("target is not represent");
        }else{
            System.out.println("index of targer " + result);
        }
    }
}