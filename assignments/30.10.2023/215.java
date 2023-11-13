import java.util.*;
class Solution {
    PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> b-a);
    public int findKthLargest(int[] nums, int k) 
    {
        for(int num:nums)
        {
            pq.add(num);
        }
        for(int i=0;i<k-1;i++)
        {
            pq.remove();
        }
        return pq.poll();
    }
}