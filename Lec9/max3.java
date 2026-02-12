public class max3 {
    public static int max(int a, int b, int c) {
        if (a>b && a>c) {
            System.out.println("a is greatest");
        }
        else if (b>a && b>c) {
            System.out.println("b is greatest");
        }
        else {
            System.out.println("c is greatest");
        }
        return 0;
    }
    public static void max1(int a, int b, int c) {
        if (a>b && a>c) {
            System.out.println("a is greatest");
        }
        else if (b>a && b>c) {
            System.out.println("b is greatest");
        }
        else {
            System.out.println("c is greatest");
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        max(a,b,c);
        max1(a,b,c);
    }
}
