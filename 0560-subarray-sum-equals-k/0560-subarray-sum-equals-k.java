class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int sum = 0;
        Map<Integer, Integer> numFrequency = new HashMap<>();
        numFrequency.put(0,1);
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];

            if(numFrequency.containsKey(sum-k)) {
                count += numFrequency.get(sum-k);
            }

            numFrequency.put(sum,numFrequency.getOrDefault(sum,0)+1);
        }
        return count;
    }
}