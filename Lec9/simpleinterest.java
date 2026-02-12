public class simpleinterest {
    public static void simpleInterest(int a, int b, int c) {
        int x =(a*b*c)/100;
        System.out.println(x);

    }
    public static int simpleInterest1(int a, int b, int c) {
        int x =(a*b*c)/100;
        System.out.println(x);
        return 0;
    }
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 80;
        simpleInterest(a, b, c);
        simpleInterest1(a, b, c);
    }
}
