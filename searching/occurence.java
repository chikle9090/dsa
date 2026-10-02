import java.util.*;

public class occurence{

    public static int firstoccurence(int arr[], int occur) {

        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int first = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (occur == arr[mid]) {
                first = mid;
                right = mid - 1;  // move left
            }
            else if (occur < arr[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return first;
    }

    public static int lastoccurence(int arr[], int occur) {

        int left = 0;
        int right = arr.length - 1;
        int last = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (occur == arr[mid]) {
                last = mid;
                left = mid + 1;  // move right
            }
            else if (occur < arr[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return last;
    }

    static ArrayList<Integer> find(int arr[], int occur) {

        int first = firstoccurence(arr, occur);
        int last = lastoccurence(arr, occur);

        ArrayList<Integer> res = new ArrayList<>();

        res.add(first);
        res.add(last);

        return res;
    }

    public static void main(String[] args) {

        int arr[] = {2,5,6,7,8,5,9,0,5,2,6,7};

        Arrays.sort(arr);

        int occur = 5;

        ArrayList<Integer> res = find(arr, occur);

        System.out.println(res.get(0) + " " + res.get(1));
    }
}