// Runtime: 5 ms
// Memory Usage: 39.4 MB

import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int hmCount = 10;
        HashMap<Integer, List<Integer>> hm = createHash(nums, hmCount);
        return getAnswer(hm, nums, target, hmCount);
    }

    private static HashMap<Integer, List<Integer>> createHash(int[] nums, int hmCount) {
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i] / hmCount;
            List<Integer> values;
            if (hm.containsKey(key)) {values = hm.get(key);}
            else {values = new ArrayList<>();}
            values.add(i);
            hm.put(key, values);
        }
        return hm;
    }

    private static int[] getAnswer (HashMap<Integer, List<Integer>> hm, int[] nums, int target, int hmCount) {
        int difference, key;
        List<Integer> temp;
        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i];
            key = difference / hmCount;
            if (hm.containsKey(key)) {
                temp = hm.get(key);
                for (int j = 0; j < temp.size(); j++) {
                    boolean match = false;
                    int testLocation = temp.get(j);
                    int testValue = nums[testLocation];
                    if (testValue == difference && i != j) {
                        return new int[]{i, testLocation};
                    }
                }
            }
        }
        return new int[]{0,target};
    }
}
