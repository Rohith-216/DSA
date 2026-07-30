class Solution {
    public int minimumPushes(String word) {
        int strLen = word.length();

        if(strLen <= 8) {
            return strLen;
        }

        int quotient = strLen/8;
        int remainder = strLen%8;
        if(quotient == 1) {
            return remainder*2+8;
        } else if(quotient == 2) {
            return remainder*3+24;
        }else if(quotient == 3) {
            return remainder*4+48;
        }else {
            return 56;
        }

    }
}