class Solution {
    public int[] buildArray(int[] nums) 
    {
        int[] number=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
           number[i]=nums[nums[i]];
        }
        return number;    
    }
}