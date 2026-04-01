package Array;

public class arraySum {
    public static void main(String[] args) {
        int arr[]= {2,3,1,5,9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
