package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int key = 7;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) {
                found = true;
                break;
            }
        }
        System.out.println(found? "found":" not found");
    }
}
