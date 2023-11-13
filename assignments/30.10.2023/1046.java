import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> b-a);
        for(int num:stones)
        {
            pq.add(num);
        }
        while(pq.size()>1)
        {
            int a=pq.poll();
            int b=pq.poll();
            if(a==b)
            {
                continue;
            }
            else
            {
                pq.add(Math.abs(a-b));
            }
        }
        if(pq.isEmpty())
        {
            return 0;
        }
        else
        {
            return pq.poll();
        }
       
    }
}