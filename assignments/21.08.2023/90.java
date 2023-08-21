import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        generateSubset(0,result, new ArrayList<>(), nums);
        return result;     
    }
    void generateSubset(int start,List<List<Integer>> result,List<Integer> temp,int[] nums)
    {
        result.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++)
        {
            if(i>start && nums[i]==nums[i-1])
            {
                continue;
            }
            temp.add(nums[i]);
            generateSubset(i+1,result,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}