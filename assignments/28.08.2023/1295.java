
    class Solution {
    public int findNumbers(int[] nums) 
    {
        
        int even=0;
        for(int i=0;i<nums.length;i++)
        {
           String numStr=Integer.toString(nums[i]);
            if(numStr.length()%2==0)
            {
                even+=1;
            }
        }
        return even;
    }
}

