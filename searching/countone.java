public class countone {
    public static int count(int arr[]){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==0){
                end = mid - 1;
            }else if(mid == n-1|| arr[mid+1]!=1){
                return mid+1;
            }else{
                start = mid + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int arr[] = {1,1,1,0,0};
        System.out.println(count(arr));
    }
    
}
