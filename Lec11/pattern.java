public class pattern {
    public static void main(String[] args) {
        int star=1;
        int n = 5;
        int i = 1;
        while (i<=n) {
            int j = 0;
            while (j<star) {
                if (j%2==0) {
                    System.out.print(i);
                }
                else{
                    System.out.print("* ");
                }
                j++;
            }
            System.out.println();
            star+=2;
            i++;
        }
    }
}
