import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq =new PriorityQueue<>((a,b) -> (b-a));
        for(int num:nums)
        {
            pq.add(num-1);
        }
        return pq.remove()*pq.remove();
    }
}