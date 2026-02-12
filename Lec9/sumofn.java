public class sumofn {
    public static int sum(int n) {
        int sum = 0;
        for (int i=1;i<=n;i++){
             sum = sum + i;
        }
        return sum;
    }
    public static void sum1(int n) {
        int sum = 0;
        for (int i=1;i<=n;i++){
             sum = sum + i;
        }
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum:" + sum(n));
        System.out.println("Sum1:" + sum(n));
    }
}
