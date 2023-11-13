class Solution {
    public int[] twoSum(int[] nums, int target) 
    {   
      int[] temp=new int[2];
      generateSum(0,nums,target,temp);
      return temp;
    }
    private void generateSum(int start,int[] nums,int target,int[] temp)
    {
      for(int i=start;i<nums.length;i++)
      {
        for(int j=i+1;j<nums.length;j++)
        {
          if(nums[i]+nums[j]==target)
        {
          temp[0]=i;
          temp[1]=j;
          break;
        }
        }
        
      }
    }
}