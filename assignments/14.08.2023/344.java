class Solution {
    public void reverseString(char[] s)
    {
        
        char[] w=new char[s.length];

        for(int i=s.length-1;i>=0;i--)
        {
            w[s.length -i-1]=s[i];
        }
        for (int i=0;i<s.length;i++)
        {
            s[i]=w[i];
        }
    }
    }

