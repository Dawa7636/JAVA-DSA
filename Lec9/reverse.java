import java.util.Scanner;

public class reverse {
    public static void reverse(int n) {
        int ans = 0;
        while (n>0) {
            int r = n %10;
            n = n/10;
            ans = ans*10+r;
        }
        System.out.println(ans);
    }
    public static int reverse1(int n) {
        int ans = 0;
        while (n>0) {
            int r = n %10;
            n = n/10;
            ans = ans*10+r;
        }
        System.out.println(ans);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
        reverse1(n);
    }
}
