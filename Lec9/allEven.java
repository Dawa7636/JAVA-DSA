import java.util.Scanner;

class allEven{
    public static int alleven(int n){
        for (int i = 1; i <=n; i++) {
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }
        return 0;
    }
    public static void alleven1(int n){
        for (int i = 1; i <=n; i++) {
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        alleven(n);
        alleven1(n);
    }
}