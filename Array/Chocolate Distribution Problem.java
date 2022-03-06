class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        Collections.sort(a);
        long min=Long.MAX_VALUE;
        long d=0;
        for(int i=0;i+m-1<n;i++)
        {
            d=a.get(i+(int)m-1)-a.get(i);
            if(d<min)
            {
                min=d;
            }
        }
        return min;
    }
}
