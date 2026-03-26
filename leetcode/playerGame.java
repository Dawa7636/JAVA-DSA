package leetcode;

import java.util.Scanner;

public class playerGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int a = 0;
        int b = 0;
        int turn = 1;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            if (turn == 1) {
                if (arr[i] > arr[j]) {
                    a += arr[i];
                    i++;
                } else {
                    a += arr[j];
                    j--;
                }
                turn = 0;
            } else {
                if (arr[i] > arr[j]) {
                    b += arr[i];
                    i++;
                } else {
                    b += arr[j];
                    j--;
                }
                turn = 1;
            }
        }

        System.out.println("player a :"a);
        System.out.println("player b :"b);
    }
}