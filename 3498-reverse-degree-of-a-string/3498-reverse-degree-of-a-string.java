class Solution {
    public int reverseDegree(String s) {
        int sumOfString = 0;
        for(int i = 0; i<s.length(); i++) {
            int val = (s.charAt(i) - 'a') + 1;
            int product = (27 - val) * (i+1);
            sumOfString += product;
        }
        return sumOfString;
    }
}