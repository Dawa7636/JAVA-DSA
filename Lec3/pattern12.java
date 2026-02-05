package Lec3;

public class pattern12 {
    public static void main(String[] args) {
        int n = 4;
        int n1 = 5;
        int i = 0;
        while (i<=n) {
            int j =0;
            while (j<=n1) {
                if (i==0||j==0||i==n||j==n1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                j++;
                
            }
            System.out.println();
            i++;
        }
    }
}