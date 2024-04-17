// create hash map, loop through the array
// set num to the current value and the diff to target - num
// is there a key in the hash map thats equal to our diff?
// if there is, return the current index and the value of the hash map key as an integer array
// if not, add the current value to the hashmap with the key as the number and the value as the indice
// in the case of no solution, return an empty array

import java.util.HashMap;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (values.containsKey(diff)) {
                return new int[] { values.get(diff), i };
            }
            values.put(nums[i], i);
        }
        return new int[] {};
    }
}
