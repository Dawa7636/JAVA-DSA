package Lec13;

import java.util.Scanner;

public class leftshift {
    public static void leftshift(int arr[]){
        int i = 0;
        int j =i+1;
        while (i<=arr.length-2) {
            int a = arr[i];
            int b = arr[j];
            arr[i]=a;
            arr[j]=b;
            i++;
            j++;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        leftshift(arr);
        sc.close();
    }
}