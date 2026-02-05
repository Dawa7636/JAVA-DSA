package Lec3;

public class pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        while (row<=n){
            int i = n;
            while (i>=row){
                System.out.print("* ");
                i--;
            }
            System.out.println();
            row++;
        }
    }
}
