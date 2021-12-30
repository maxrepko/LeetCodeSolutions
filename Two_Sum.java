// Runtime: 103 ms
// Memory Usage: 39.2 MB

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x = 0;
        int y = 0;
        while (true) {
            if ((x != y) && (nums[x] + nums[y] == target)) {
                int[] temp = {x, y};
                return temp;
            }
            if (y == nums.length - 1) {
                y = 0;
                x++;
            }
            else y++;
        }
    }
}
