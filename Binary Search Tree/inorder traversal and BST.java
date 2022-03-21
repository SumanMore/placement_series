class Solution
{
    static int isRepresentingBST(int arr[], int N)
    {
        // code here
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>=arr[i+1])
            {
                return 0;
            }
        }
        return 1;
    }
}
