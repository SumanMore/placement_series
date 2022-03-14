class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int ar[]=new int[n];
        int k=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                c++;
            }
            else
            {
                ar[k++]=arr[i];
            }
        }
        for(int i=0;i<c;i++)
        {
            ar[k++]=0;
        }
        for(int i=0;i<ar.length;i++)
        {
            arr[i]=ar[i];
        }
    }}
