class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
        
        
    String s=Integer.toBinaryString(n);
    int res=0;
    for(int i=s.length()-1;i>=0;i--)
    {
      
       if(s.charAt(i)=='1')
       {
           res=s.length()-i;
           break;
       }
        
    }
    return res;
    }
}
