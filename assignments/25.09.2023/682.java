import java.util.*;
class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        for(String c:op)
        {
            if(c.equals("+"))
            {
                int top=stack.pop();
                int newTop=top+stack.peek();
                stack.push(top);
                stack.push(newTop);
            }
            else if( c.equals("D"))
            {
                int top=stack.peek()*2;
                stack.push(top);
            }
            else if( c.equals("C"))
            {
                stack.pop();
            }
            else
            {
                stack.push(Integer.parseInt(c));
            }
        }
        for(int score:stack)
        {
            sum+=score;
        }
        return sum;
    }
}