class Solution {
    public int[] twoSum(int[] nums, int target) {
        int max = 0;
        int min = 0;
        int newLength = 0;
        // Sets the min and max for my solution
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        // Finds the amount of numbers that could possibly reach our target
        // For example, negatives plus the biggest number. If the result is less than the target, then
        // we cannot reach the 
        for (int i = 0; i < nums.length; i++) {
            if() {}
        }
        
        int[] newList 
        
        int[] temp = {min,max};
        return temp;
    }
}
