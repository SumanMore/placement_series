class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n)
    {
       int count=0;
        for(int i=1;i<=n;i++)
        {
           int r=i;
          while(r>0)
          {
           if((r&1)==1)
           count++;
           r=r>>1;
       }
       
            
        }
       return count;
   
    }
    
}
