class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<numRows; i++) {
            res.add(generateRow(i));
        }
        return res;
    }

    private List<Integer> generateRow(int row) {
        List<Integer> list = new ArrayList<>();
        
        int ans = 1;
        int temp = row;
        list.add(ans);
        for(int i=1; i<=row; i++) {
            ans *= temp;
            ans /= i;
            list.add(ans);
            temp--;
        }
        return list;
    }
}