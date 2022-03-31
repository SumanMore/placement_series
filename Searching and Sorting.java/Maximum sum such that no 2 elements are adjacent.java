class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
         int inc = 0, exc = 0;
        for(int i = 0; i < n; i++){
            int temp = inc;
            inc = arr[i] + exc;
            exc = Math.max(temp, exc);
        }
        return Math.max(inc, exc);
    }
}
