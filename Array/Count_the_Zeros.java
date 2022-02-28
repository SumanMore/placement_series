class Solution {
    int countZeroes(int[] arr, int n) {
        // code here
        int c=0;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]==0)
            {
            c++;
            }
            else
            {
                break;
            }
            
        }
        return c;
    }

}
