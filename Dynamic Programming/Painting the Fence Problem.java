class Solution
{
    long countWays(int n,int k)
    {
        //code here.
        long mod=  1000000007;
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return k;
        }
        long same=k%mod;
        long diff=(k*(k-1))%mod;
        for(int i=3;i<=n;i++)
        {
            long prev=diff%mod;
            diff=((same+diff)*(k-1))%mod;
            same=prev%mod;
        }
        return (same+diff)%mod;
    }
}


