package Lec2;

import java.util.Scanner;

public class lottery2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1100 && n <= 1500) {
            System.out.println("The prize is Bike");
            if (n >= 1380 && n <= 1500) {
                System.out.println("Kawasaki ninja H2");
            }
            if (n >= 1100 && n <= 1380) {
                System.out.println("Benelli");
            }
        }
        else if (n >= 300 && n <= 460) {
            System.out.println("The prize is Macbook");
            if (n >= 390 && n <= 460) {
                System.out.println("Model M2");
            }
            if (n >= 300 && n <= 390) {
                System.out.println("Model M1");
            }
        }
        else if (n >= 200 && n <= 280) {
            System.out.println("The prize is Cycle");
            if (n >= 250 && n <= 280) {
                System.out.println("mountain cycle");
            }
            if (n >= 200 && n <= 250) {
                System.out.println("normal cycle");
            }
        }
        else if (n >= 50 && n <= 80) {
            System.out.println("The prize is Kurkure");
            if (n >= 70 && n <= 80) {
                System.out.println("30rs packet");
            }
            if (n >= 50 && n <= 70) {
                System.out.println("20rs packet");
            }
        }
        else{
            System.out.println("Better luck next time.");
        }
    }
}
