class Solution {
    public int smallestNumber(int n, int t) {
        int temp = n;
        while(product(temp)%t != 0) {
            temp++;
        }
    
        return temp;
    }

    public int product(int n) {
        int product = 1;
        int temp = n;
        while(temp > 0) {
            product *= temp%10;
            temp = temp/10;
        }
        return product;
    }
}