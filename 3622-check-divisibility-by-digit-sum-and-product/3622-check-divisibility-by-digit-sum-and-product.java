class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int original = n;

        while(n > 0) {
            int value = n%10;
            sum += value;
            product *= value;
            n = n/10;
        }

        int totalSum = sum + product;
        if(original % totalSum != 0) return false;

        return true;
    }
}