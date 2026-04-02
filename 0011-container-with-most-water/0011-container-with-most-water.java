class Solution {
    public int maxArea(int[] height) {
        int first = 0, last = height.length-1;
        int maxArea = 0;
        while(first<=last) {
            int minHeight = Math.min(height[first], height[last]);
            maxArea = Math.max(maxArea, minHeight*(last-first));
            if(minHeight == height[first]) {
                first++;
            } else {
                last--;
            }
        }
        return maxArea;
    }
}