public boolean findTriplets(int arr[] , int n)
    {
        for(int i=0;i<n;i++)
       for(int j=i+1;j<n;j++)
       for(int k=j+1;k<n;k++)
       if(arr[i]+arr[j]+arr[k]==0)
            return true;
       return false;
    }
