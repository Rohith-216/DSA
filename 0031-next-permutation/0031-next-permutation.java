class Solution {
    public void nextPermutation(int[] nums) {
        int breakValue = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                breakValue = i;
                break;
            }
        }

        if(breakValue == -1) arrRev(nums, 0);
        else {

            for(int i=nums.length-1; i>=breakValue; i--) {
           
                if(nums[i] > nums[breakValue]) {
                    int temp = nums[i];
                    nums[i] = nums[breakValue];
                    nums[breakValue] = temp;
                    break;
                }
            }

            arrRev(nums, breakValue+1);
        }
    }

    public void arrRev(int[] nums, int left) {
        int right = nums.length-1;
        while (left < right) {
           int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}