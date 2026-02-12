public class max2 {
    public static int max(int a, int b) {
        if (a>b) {
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("b is greater than a");
        }
        return 0;
    }
    public static void max1(int a, int b) {
        if (a>b) {
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("b is greater than a");
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        max(a,b);
        max1(a,b);
    }
}
