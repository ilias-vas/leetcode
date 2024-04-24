// binary search algo - left pointer at start, right pointer at end. Calculate the middle (l+r)/2 if the middle is > than the target, move the right pointer to mid - 1.
// if the middle is < than the target, move the left pointer to m + 1.
// otherwise we found the target so return that indice

class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1; 
        while (l <= r) {
            int m = (l+r)/2;
            if (nums[m] < target) {
                l = m+1;
            } else if (nums[m] > target) {
                r = m-1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
