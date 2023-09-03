class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int ones=0;
        
        int threes=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                ones+=1;
            }
            else
            {
                if(ones>=threes)
            {
                threes=ones;
            }
                
                ones=0;
                
            }
            
            
           
        }
        if(ones>=threes)
            {
                threes=ones;
            }
         return threes;    
    }
}