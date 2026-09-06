class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();

        int[][] dp = new int[m + 1][n + 1];

        // Empty t can be formed from any s in exactly 1 way
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n];
        // int size1 = s.length();
        // int size2 = t.length();
        // int noOfSubseq = 0;

        // for (int i = 0; i < size1; i++) {

        //     if (s.charAt(i) == t.charAt(0)) {
        //         int j = i + 1;
        //         int k = 1;
        //         HashMap<Integer, Integer> map = new HashMap<>();
        //         map = findFirstSeq(j, k, s, t);
        //         int cnt = map.get(size2) + 1;

        //         if (cnt < size2)
        //             return noOfSubseq;
        //         else if (cnt == size2) {
        //             noOfSubseq++;
        //             int temp = size2;
        //             while (temp > 2) {
        //                 temp--;
        //                 cnt--;
        //                 int index = map.get(temp);
        //                 backTrack(index, temp, s, t, noOfSubseq, cnt);
        //             }

        //         }
        //     }
        // }
        // return noOfSubseq;
    }

    // private void backTrack(int index, int k, String s, String t, int noOfSubseq, int cnt) {
    //     int temp = k;
    //     int stIndex = 0;
    //     int temp2 = index;
    //     while (index < s.length() && k < t.length()) {
    //         int foundIndex = characterFind(index, k, s, t);
    //         if(foundIndex != -1 && index == temp2) stIndex = foundIndex+1;
    //         if (foundIndex != -1) {
    //             cnt++;
    //             if(cnt == t.length()) {
    //                 noOfSubseq++;
    //                 cnt -= (cnt - temp);
    //                 backTrack(stIndex+1, temp, s, t, noOfSubseq, cnt);
    //             }
    //             index = foundIndex;
    //         }
    //         index++;
    //     }
    //     return;
    // }

    // private HashMap<Integer, Integer> findFirstSeq(int j, int k, String s, String t) {
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     int cnt = 0;
    //     while (j < s.length() && k < t.length()) {
    //         int foundIndex = characterFind(j, k, s, t);
    //         if (foundIndex != -1) {
    //             map.put(k, foundIndex);
    //             cnt++;
    //             j = foundIndex;
    //             k++;
    //         }
    //         j++;
    //     }
    //     map.put(t.length(), cnt);
    //     return map;
    // }

    // private int characterFind(int j, int k, String s, String t) {
    //     while (j < s.length()) {
    //         if (s.charAt(j) == t.charAt(k)) {
    //             return j;
    //         }
    //         j++;
    //     }

    //     return -1;
    // }
}