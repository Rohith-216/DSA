class Solution {
    public int longestSubsequence(int[] nums) {
        int len = 0;
        int xor_all = 0;int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) count++;
            xor_all ^= nums[i];
        }

        if(count == nums.length) return 0;
        else if(xor_all == 0) return nums.length-1;
        
        return nums.length;
    }
}