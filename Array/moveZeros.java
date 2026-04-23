package Array;

public class moveZeros {
    public static void main(String[] args) {
        int arr[]={1,0,1,0,0,1,1,0};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        while (j<arr.length) {
            arr[j]=0;
            j++;
        }
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
