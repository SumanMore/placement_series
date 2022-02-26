class Main
{
    public static void main(String args[])
     {
        int arr[]={10,15,1,2,9,16,11};
        quick_Sort(arr,0,arr.length-1);
        printArray(arr);
        
     }
        
        static int partition(int arr[],int lb,int ub)
        {
            int pivot=arr[lb];
           int  start=lb;
            int end=ub;
            while(start<=end)
            {
                while(arr[start]<=pivot)
                {
                    start++;
                }
                while(arr[end]>pivot)
                {
                    end--;
                }
                if(start<end)
                {
                    int temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                }
            }
            int temp1=arr[lb];
            arr[lb]=arr[end];
            arr[end]=temp1;
            return end;
        }
        static void quick_Sort(int arr[],int lb,int ub)
        {
            if(lb<ub)
            {
                int loc=partition(arr,lb,ub);
                quick_Sort(arr,lb,loc-1);
                quick_Sort(arr,loc+1,ub);
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
