package Lec3;

public class pattern13 {
    int n1 = 4;
    int n2 = 5;
    for(int i=0; i<=n1; i++){
        for(int j = 0; j<=n2; j++){
            if (i==0||j==0||i==n1||j==n2) {
                System.out.print("* ");
            }
            else{
                System.out.println();
                
            }
        }
    }
}
