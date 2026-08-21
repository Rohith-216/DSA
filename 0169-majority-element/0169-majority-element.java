class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int el = nums[0];

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == el) {
                count++;
            } else {
                count--;
            }

            if(count < 0) {
                count = 0;
                el = nums[i];
            }
        }

        return el;
    }
}