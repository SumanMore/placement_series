class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    if(n>=3)
	    {
	    Arrays.sort(a);
	    return a[n-3];
    }
    else
    {
        return -1;
    }}
}
