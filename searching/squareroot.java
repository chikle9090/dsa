public class squareroot {
    public static int floorsquat(int n){
        int start = 1;
        int end = n;
        int res = 1;
        while(start<=end){
            int mid = start + (end - start) /2;
            if(mid * mid <= n){
                res=  mid;
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int n = 8;
        System.out.println(floorsquat(n));
    } 
}
