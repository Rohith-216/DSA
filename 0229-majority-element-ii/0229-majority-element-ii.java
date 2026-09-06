class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0;
        int el1 = 0, el2 = 0;

        for(int i=0; i<nums.length; i++) {
            if(cnt1 == 0 && nums[i] != el2) {
                cnt1++;
                el1 = nums[i];
            } else if(cnt2==0 && nums[i] != el1) {
                cnt2++;
                el2 = nums[i];
            } else if(el1 == nums[i]) cnt1++;
            else if(el2 == nums[i]) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> ls = new ArrayList<>();

        cnt1 = 0; cnt2 = 0;
        int val = nums.length/3 + 1;

        for(int j = 0; j<nums.length; j++) {
            if(el1 == nums[j]) cnt1++;
            else if(el2 == nums[j]) cnt2++;
        }

        if(cnt1 >= val) ls.add(el1);
        if(cnt2 >= val) ls.add(el2);
        Collections.sort(ls);
        
        return ls;
    }
}