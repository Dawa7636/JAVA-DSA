package Lec2;

import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1100 && n <= 1500) {
            System.out.println("The prize is Bike");
        }
        else if (n >= 300 && n <= 460) {
            System.out.println("The prize is Macbook");
        }
        else if (n >= 200 && n <= 280) {
            System.out.println("The prize is Cycle");
        }
        else if (n >= 50 && n <= 80) {
            System.out.println("The prize is Kurkure");
        }
        else{
            System.out.println("Better luck next time.");
        }
    }
}
