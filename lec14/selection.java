package lec14;

public class selection {
    public static void selection(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min]) {
                    min = j;
                }
            }
            int c= arr[i];
            arr[i]= arr[min];
            arr[min]= c;
        }
        System.out.println("sorted array");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr= new int[]{4,5,2,3,1};
        selection(arr);
    }
}
