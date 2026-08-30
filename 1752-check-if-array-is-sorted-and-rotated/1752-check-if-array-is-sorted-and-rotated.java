class Solution {
    public boolean check(int[] nums) {
        boolean res = false;
        int index = 0;
        do {
            res = isArraySorted(nums);
            if(res) return res;

            int temp = nums[0];
            for(int i=0; i<nums.length-1; i++) {
                nums[i] = nums[i+1];
            }
            nums[nums.length-1] = temp;
            index++;

        }while(index<nums.length);

        return res;
    }

    private boolean isArraySorted(int[] nums) {
        for(int i = 0; i<nums.length-1; i++) {
            if(nums[i+1]<nums[i]) {
                return false;
            }
        }
        return true;
    }
}