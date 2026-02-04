import java.util.Scanner;

public class VolShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("radius:");
        double r = sc.nextDouble();

        System.out.println("height:");
        double h = sc.nextDouble();

        double cone = (1.0/3)*Math.PI*r*r*h;
        double cylinder = Math.PI*r*r*h;
        double hemisphere = (2.0/3)*Math.PI*r*r*r;

        System.out.println("volume of cone:" + cone);
        System.out.println("volume of cylinder:" + cylinder);
        System.out.println("volume of hemisphere:" + hemisphere);
    }
}
