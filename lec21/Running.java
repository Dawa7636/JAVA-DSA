public class Running {
    public static int[] Running(int[] nums) {
        int[] result = new int[nums.length];
        
        result[0] = nums[0];  // first element stays same
        
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = Running(nums);

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}