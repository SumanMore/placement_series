class Solution
{
    //Function to find the nth catalan number.
    public static BigInteger findCatalan(int n)
    {
        //Your code here
          BigInteger[]arr=new BigInteger[n+1];
        arr[0]=BigInteger.valueOf(1);
       arr[1]=BigInteger.valueOf(1);
       for(int i=2;i<=n;i++){
           arr[i]=BigInteger.valueOf(0);
           for(int j=0;j<i;j++)
           {
               arr[i]=arr[i].add(arr[j].multiply(arr[i-1-j]));
           }
       }
       return arr[n];
        
    }
}
