class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minValueIndex = -1;
        for(int i=0; i<nums.length; i++) {
            if(max < nums[i]) max = nums[i];

            if(minValueIndex < i) {
                min = Integer.MAX_VALUE;
                for(int j = i; j<nums.length; j++) {
                    if(min >= nums[j]) {
                        min = nums[j];
                        minValueIndex = j;
                    }
                }
            }

            if(max-min <= k) return i;
        }
        return -1;
    }
}