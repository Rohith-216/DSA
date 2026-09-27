class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for(int i=0; i<s.length(); i++) {
            if(arr[i] == '(') {
                stack.push(i);
            } else if(arr[i] == ')') {
                int left = stack.pop();
                reverseSubArray(arr, left+1, i-1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != '(' && arr[i] != ')') {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }

    private void reverseSubArray(char[] arr, int left, int right) {
        while(left<right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            right--;
            left++;
        }
    }
}