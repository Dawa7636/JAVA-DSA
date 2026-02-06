package Lec4;

public class pyramid2 {
    public static void main(String[] args) {
        int n = 5;
        int space = n-1;
        int star = 1;
        for(int row = 1;row<=n;row++){
            for(int i = 1;i<=space;i++){
                System.out.print("  ");
            }
            for(int j =1;j <=star;j++){
                System.out.print("* ");
            }
            System.out.println();
            star = star + 2;
            space--;
        }
    }
}
