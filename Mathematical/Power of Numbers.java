class Solution
{
        
    long power(int n,int r)
    {
        //Your code here
        if(r == 0) 
            return 1;
        long res = power(n, r/2);
        res= (res * res) % 1000000007;
        if(r % 2 != 0) 
             return (res * n) % 1000000007;
        return res;
        
    }

}
