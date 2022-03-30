Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers.
  
  
  class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
     int k=m^n;
     int c=1;
     while(k!=0)
     {
        if((k&1)==1)
        {
            return c;
        }
        c++;
        k>>=1;
     }
     return -1;
     
     
     
            
    }
}

