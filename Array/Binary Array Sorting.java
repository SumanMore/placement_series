class Solution
{
    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
        // add your code here
        int arr[]=new int[N];
        int k=0;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(A[j]==i)
                {
                   arr[k++]=i; 
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            A[i]=arr[i];
        }
        
        /**************
        * No need to print the array
        * ************/
    }
