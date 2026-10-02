public class missingnumber {
    public static int findelm(int[] arr){
        long sum = 0;
        long n = arr.length+1;
        
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        long expsum = n*(n+1)/2;

        return(int)(expsum - sum);
    }
    public static void main(String[] args){
        int arr[] = {5,3,4,1};
        System.out.println(findelm(arr));
    }
    
}
