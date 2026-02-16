import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr=new int[5];
        int tar;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        tar =sc.nextInt();
        for(int i = 0; i<5;i++){
            if (arr[i]==tar) {
                System.out.println("true");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("not found");
        }
    }
}
