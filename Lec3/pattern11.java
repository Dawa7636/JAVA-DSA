package Lec3;

public class pattern11 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = 0;
        int star = n;
        for (row = 1; row <= n; row++){
            for (int i = 1; i <= space; i++){
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++){
                System.out.print("* ");
            }
            System.out.println();
            space+=2;
            star--;
        }
    }
}
