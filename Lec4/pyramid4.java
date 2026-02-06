package Lec4;

public class pyramid4 {
    public static void main(String[] args) {
        int n = 9;
        int star = 2*n-1;
        int space = 0;
        int row = 1;
        while (row<=n) {
            int i = 1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j<=star) {
                System.out.print("* ");
                
            }
        }
    }
}
