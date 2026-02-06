package Lec4;

public class pyramid8 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int space = 2*n -3;
        int row = 1;
        while (row<=n) {
            int i = 1;
            while (i<=star) {
                System.out.print("* ");
                i++;
            }
            int j = 1;
            while (j<=space) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while (k<=star) {
                if (row == n) {
                    System.out.print("* ");
                    star --;
                }else{
                    System.out.print("* ");
                }
                k++;
            }
            System.out.println();
            star ++;
            space = space - 2;
            row ++;
        }
    }
}
