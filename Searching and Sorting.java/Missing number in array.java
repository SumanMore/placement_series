class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int total=0;
        int sum=(n*(n+1))/2;
        for(int i=0;i<n-1;i++)
        {
            total=total+array[i];
        }
        return sum-total;
        
    }
}
