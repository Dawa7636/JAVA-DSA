package Lec2;

public class slope {
    public static void main(String[] args) {
        int y1= 20;
        int y2= 3;
        int y3= 4;
        int x1= 5;
        int x2= 6;
        int x3= 7;
        
        int m1 = (y2-y1)/(x2-x1);
        int m2 = (y3-y2)/(x3-x2);

        if (m1 == m2) {
            System.out.println("it is a straight line");
        }
        else{
            System.out.println("not a straight line");
        }
    }
}
