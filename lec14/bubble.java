package lec14;

import java.util.Scanner;

public class bubble {
    public static void bubblesort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n-1-i; j++){
                if (arr[j]>arr[j+1]) {
                    int c= arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]= c;
                }
            }
        }
        System.out.println("sorted array");
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= new int[]{5,9,7,8,6};
        bubblesort(arr);
    }
}
