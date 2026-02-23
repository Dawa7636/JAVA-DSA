package lec14;

public class insertion {
    public static void insertion(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int j = i-1;
            int item = arr[i];
            while (j>0&&arr[j]>item) {
                arr[j+1]=arr[j];
                arr[j]=item;
                j--;
            }
            
        }
        System.out.println("sorted array");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr= new int[]{4,5,2,3,1};
        insertion(arr);
    }
}
