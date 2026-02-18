package Lec13.swapnumber;

public class xor {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        a = a^b;
        b = a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
