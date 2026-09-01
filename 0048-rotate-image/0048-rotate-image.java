class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;//no.of rows
        int n = matrix[0].length;//no.of colmuns

        for(int i=1; i<m; i++) {
            for(int j=0; j<i; j++) {
                swap(matrix, i, j);
            }
        }

        for(int i=0; i<m; i++) {
            rotateArray(matrix[i]);
        }
    }

    private void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    private void rotateArray(int[] arr) {
        int left = 0, right = arr.length-1;
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        } 
    }
}