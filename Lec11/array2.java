import java.util.Scanner;

public class array2 {
    public static void display(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr= new int[5];
        for(int i = 0; i<5; i++){
            arr[i]=sc.nextInt();
        }
        display(arr);
    }
}
