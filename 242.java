// target integer of n / 2
// create an empty hash map, loop through the hashmap   

import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        int target = nums.length / 2;
        HashMap<Integer, Integer> valMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            if (valMap.containsKey(nums[i])) {
                count = valMap.get(nums[i]);
            }
            valMap.put(nums[i], count + 1);
        }

        for (HashMap.Entry<Integer, Integer> entry : valMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value > target) {
                return key;
            }
        }

        return 0;
    }
}
