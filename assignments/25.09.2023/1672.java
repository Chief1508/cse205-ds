class Solution {
    public int maximumWealth(int[][] accounts) 
    {
       
        int maxSum=0;
        for(int[] cust : accounts)
        {
             int sum=0;
             for(int account: cust )
             {
                 sum+=account;
             }
             maxSum=Math.max(maxSum,sum);
        }
        return maxSum;        
    }
}