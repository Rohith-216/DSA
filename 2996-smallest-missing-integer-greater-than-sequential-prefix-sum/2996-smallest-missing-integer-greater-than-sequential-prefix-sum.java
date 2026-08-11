class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int totalSum = nums[0]; int j=1;
        while(j<nums.length && nums[j] == nums[j-1]+1) {
            totalSum += nums[j];
            j++;
        }

        for(int key: nums) {
            set.add(key);
        }

        while(set.contains(totalSum)) totalSum++;

        return totalSum;
    }
}