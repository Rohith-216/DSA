class Solution {
    public int missingInteger(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();

        int totalSum = nums[0]; int j=1;
        while(j<nums.length && nums[j] == nums[j-1]+1) {
            totalSum += nums[j];
            j++;
        }

        int x = totalSum;
        while(true) {
            boolean found = false;
            for(int num:nums) {
                if(num == x) {
                    found = true;
                    break;
                }
            }

            if(!found) return x;

            x++;
        }
        // for(int key: nums) {
        //     set.add(key);
        // }

        // while(set.contains(totalSum)) totalSum++;

        // return totalSum;
    }
}