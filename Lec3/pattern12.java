package Lec3;

public class pattern12 {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        while (i<=n) {
            int j =0;
            while (j<=n) {
                if (i==0||j==0||i==n-1||j==n-1) {
                    System.out.print("* ");
                }
                else{
                    System.out.println();
                }
                j++;
                
            }
            i++;
        }
    }
}