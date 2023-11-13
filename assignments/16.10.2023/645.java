import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int[] ans=new int[2];
        
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                ans[0]=nums[i];  
            }
            else
            {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        for(int i=1;i<=nums.length;i++)
        {
           if(!map.containsKey(i))
           {
               ans[1]=i;
               break;
           } 
        }
        return ans;
    }
}