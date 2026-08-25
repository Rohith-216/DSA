class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums) set.add(num);

        int multiplier = 1;
        while(set.contains(k*multiplier)) {
            multiplier++;
        }

        return k*multiplier;
    }
}