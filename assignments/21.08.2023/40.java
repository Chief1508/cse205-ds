import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
         List<List<Integer>> comb=new ArrayList();
        Arrays.sort(candidates);
        generateCombination(0,candidates, new ArrayList<>(),comb,target);
        
        return comb;
        
    }
        void generateCombination(int start, int[] nums, List<Integer> current, List<List<Integer>> comb, int target)
        {   
            
            if (target == 0) {
            comb.add(new ArrayList<>(current));
            return;
        }
        
         
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;}
            else if (target - nums[i] >= 0) {
                
                current.add(nums[i]);
               
                generateCombination(i+1, nums, current, comb, target - nums[i]);
                current.remove(current.size()-1 );
                
            }
        }
        
    }}
