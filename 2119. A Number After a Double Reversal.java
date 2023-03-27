class Solution {
    public boolean isSameAfterReversals(int num) 
    {
        long rev=0,rem;
        int i=1;
        long x=num;
        while(i<=2)
        {
            rev=0;
         while(x != 0)
        {
            rem=x%10;
            rev= rev*10 + rem;
            x = x/10;
        }
        x=rev;
        i++;
        }
        
        if(rev==num)
        {
            return true;
        }
        return false;
    }
}
