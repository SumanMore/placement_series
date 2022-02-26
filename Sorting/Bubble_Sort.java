
class Main
{
    public static void main(String args[])
     {
        int arr[] = {64,25,12,22,11};
        bubble_sort(arr);
     }
    static void bubble_sort(int arr[])
    {
         int n = arr.length;
        
         for (int i = 0; i < n; i++)
            {
             
              for (int j = 0; j < n-i-1; j++)
                {
                  if (arr[j] > arr[j+1])
                  {
                    int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
             }}}
    
     for(int k=0;k<n;k++)
          {
          System.out.print(arr[k]+" ");
          }
    }
   }
