class Solution {
    public boolean stoneGame(int[] piles) {
        long[] players = new long[2];
        players = getWinner(piles, 0, piles.length - 1);
        if(players[0] < players[1]) { return false; }
        return true;
    }

    public long[] getWinner(int[] stones, int start, int last) {
        int alice = 0, bob = 0;
        long[] playersScore = new long[2];
        if (start < last) {
            if(stones[start] >= stones[last]) {
                alice = stones[start];
                start += 1;
            } else {
                alice = stones[last];
                last -= 1;
            }

            if(stones[start] <= stones[last]) {
                bob = stones[start];
                start += 1;
            } else {
                bob = stones[last];
                last -= 1;
            }
            playersScore = getWinner(stones, start, last);
            playersScore[0] += alice;
            playersScore[1] += bob;
            return playersScore;
        }

        playersScore[0] += alice;
        playersScore[1] += bob;
        return playersScore;
    }
}