package Array;

public class secondLargest {
    public static void main(String[] args) {
        int arr []= {1,2,3,4,5};
        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>f) {
                s = f;
                f = arr[i];
            }
            else if (arr[i]>s&&arr[i]!=f) {
                s = arr[i];
            }
        }
        System.out.println(s);
    }
}
