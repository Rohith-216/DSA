class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int xl = Math.max(rec1[0], rec2[0]);
        int yt = Math.max(rec1[1], rec2[1]);
        int xr = Math.min(rec1[2], rec2[2]);
        int yb = Math.min(rec1[3], rec2[3]);

        if((xl < xr) && (yt < yb)) return true;

        return false;
    }
}