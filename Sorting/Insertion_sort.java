class Main
{
    public static void main(String args[])
     {
        int arr[] = {64,25,12,22,11};
        insertion_sort(arr);
     }
    static void insertion_sort(int arr[])
    {
         int temp,j;
         for(int i=1;i<arr.length;i++)
         {
             temp=arr[i];
             j=i-1;
             while(j>=0 && arr[j]>temp)
             {
                 arr[j+1]=arr[j];
                 j=j-1;
             }
             arr[j+1]=temp;
         }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }}
        
         
