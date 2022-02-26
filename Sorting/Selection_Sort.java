class Main
{
    public static void main(String args[])
     {
        int arr[] = {64,25,12,22,11};
        selection_sort(arr);
     }
    static void selection_sort(int arr[])
    {
         int n = arr.length;
         int min;
         for (int i = 0; i < n-1; i++)
            {
              min= i;
              for (int j = i+1; j < n; j++)
                {
                  if (arr[j] < arr[min])
                      min = j;
                }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    
     for(int k=0;k<n;k++)
          {
          System.out.print(arr[k]+" ");
          }
     }
   }
