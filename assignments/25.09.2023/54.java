import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        while(answer.size()<n*m){
        for(int i=left;i<=right;i++)
        {
            answer.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++)
        {
            answer.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom && left<=right){
        for(int i=right;i>=left;i--)
        {
            answer.add(matrix[bottom][i]);
        }
        bottom--;
        for(int i=bottom;i>=top;i--)
        {
            answer.add(matrix[i][left]);
        }
        left++;
        }}
        return answer;
    }
}