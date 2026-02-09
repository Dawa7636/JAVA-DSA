public class pattern4 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = 1;
        int star = n-1;
        while (row<=2*n-1) {
            int j = 1;
            while (j<=star) {
                System.out.print("* ");
                j++;
            }
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            if(row<n){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            row++;
        }
    }
}
