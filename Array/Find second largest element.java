class Solution
{ 
    public static int print2largest(int A[],int N) 
    {
       Arrays.sort(A);
       if(N<2)
       {
           return -1;
       }
       else
       {
           for(int i=N-1;i>=1;i--)
           {
               if(A[i]!=A[i-1])
               {
                   return A[i-1];
               }
           }
           
       }
       return -1;
    }
}
