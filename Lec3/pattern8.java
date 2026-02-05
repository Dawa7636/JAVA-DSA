package Lec3;

public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = n - 1;
        int star = 1;
        for (row = 1; row <= n; row++){
            for (int i = 1; i <= space; i++){
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++){
                System.out.print("* ");
            }
            System.out.println();
            space--;
            star++;
        }
    }
}
            

