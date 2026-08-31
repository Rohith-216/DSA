class Solution {
    public void setZeroes(int[][] matrix) {
        int rowFirstIndex = 1;
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    if(i==0) {
                        rowFirstIndex = 0;
                    }
                    else {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if(matrix[i][j] != 0 && (matrix[i][0] == 0 || matrix[0][j] == 0)) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0) {
            for(int k = 1; k<m; k++) {
                if(matrix[k][0] == 0) continue;
                matrix[k][0] = 0;
            }
        }

        if(rowFirstIndex == 0) {
            for(int k=0; k<n; k++) {
               if(matrix[0][k] == 0) continue;
                matrix[0][k] = 0;
            }
        }
    }
}