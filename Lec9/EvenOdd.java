import java.util.Scanner;
public class EvenOdd {
    public static int evenodd1(int n) {
        if (n%2==0) {
           System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        return n;
    }
    public static void evenodd2(int n) {
        if (n%2==0) {
           System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenodd1(n);
        evenodd2(n);
    }
   
}
