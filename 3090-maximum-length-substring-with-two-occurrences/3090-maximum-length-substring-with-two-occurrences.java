class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        for(int right=0; right<s.length(); right++) {
            int count = map.getOrDefault(s.charAt(right), 0) + 1;
            map.put(s.charAt(right), count);

            while(count > 2) {
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
                count = map.get(s.charAt(right));
            }

            maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen;
    }
}