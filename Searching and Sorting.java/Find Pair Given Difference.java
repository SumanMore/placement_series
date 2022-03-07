class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
       for(int i=0;i<size-1;i++)
       {
           for(int j=i+1;j<size;j++)
           {
               if(Math.abs(arr[i]-arr[j])==n)
               {
                   return true;
               }
           }
       }
       return false;
    }
}
