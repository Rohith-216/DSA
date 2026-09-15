class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> fourSumList = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = nums.length-1;
            while(j-i > 2) {
                int k = i+1;
                int l = j-1;
                while(k<l) {
                    long sum = (long) nums[i]+nums[k]+nums[l]+nums[j];

                    if(sum < target) {
                        k++;
                    } else if(sum > target) {
                        l--;
                    } else {
                        List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[k], nums[l], nums[j]));
                        fourSumList.add(temp);
                        k++;
                        l--;

                        while(k<l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l] == nums[l+1]) l--;
                    }
                }
                j--;
                while(j-i > 2 && nums[j] == nums[j+1]) j--;
            }
        }
        return fourSumList;
    }
}