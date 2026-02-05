package Lec3;

public class pattern4 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        while (row<=n){
            int i = 1;
            while (i<=row){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
