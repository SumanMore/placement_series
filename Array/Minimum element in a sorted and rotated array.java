class Solution
{
    int findMin(int arr[], int n)
    {
        //complete the function here
    int k=arr[0];
    for(int i=0;i<n;i++)
    
    {
        if(arr[i]<k)
        {
            k=arr[i];
        }
    }
    return k;
    }
}
