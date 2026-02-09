public class pattern1 {
    public static void main (String []args){
        int n = 5;
        int star = 1;
        int space = 0;
        int row = 1;
        while (row<=2*n-1) {
            int j = 1;
            while (j<=star) {
                System.out.print("* ");
                j++;
            }
            int i = 1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            System.out.println();
            if(row<n){
                star++;
            }
            else{
                star--;
            }
            space--;
            row++;
        }
    }
}
