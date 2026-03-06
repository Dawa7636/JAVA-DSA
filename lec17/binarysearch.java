public class binarysearch {
    public static int binarysearch(int[]arr, int target){
        int start = 0;
        int end = arr.length- 1;
        while (start <= end) {
            int mid = start+(end - start)/2;
            if (arr[mid]==target) {
                return 1;
            }
            else if (arr[mid]>target) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        int target = 6;
        int result = binarysearch(arr, target);
        if (result != -1) {
            System.out.println("element found" + result);
        }
        else{
            System.out.println("element not found");
        }
    }   
}
