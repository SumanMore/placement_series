class Main
{
    public static void main(String args[])
     {
        int arr[] = {64,25,12,22,11};
        int lb=0,ub=arr.length-1;
        merge_sort(arr,lb,ub);
        printArray(arr);
     }
    static void merge_sort(int arr[],int lb,int ub)
    {
      int mid=0;
      if(lb<ub) 
      {
         mid=(lb+ub)/2;
         merge_sort(arr,lb,mid);
         merge_sort(arr,mid+1,ub);
         merge(arr,lb,mid,ub);
         
      }
    }
     static void merge(int arr[],int lb,int mid,int ub )
      {
          int b[]=new int[arr.length];
         
          int i=lb,k=lb,j=mid+1;
          while(i<=mid&&j<=ub)
          {
              if(arr[i]<=arr[j])
              {
                  b[k]=arr[i];
                  i++;
              }
              else
              {
                 b[k]=arr[j];
                 j++;
              }
              k++;
          }
          if(i>mid)
          {
              while(j<=ub)
              {
                  b[k]=arr[j];
                  j++;
                  k++;
              }
          }      
              else
              {
              while(i<=mid)
              {
                  b[k]=arr[i];
                  i++;
                  k++;
              }
                  
              }
          for(int l=lb;l<=ub;l++)
          {
              arr[l]=b[l];
          }
         
          
      }
      static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
}
         
