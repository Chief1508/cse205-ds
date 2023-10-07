class Solution {
    public int[][] transpose(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        
        int[][] transpose = new int[colLen][rowLen];
        
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        return transpose;   
    }
}







