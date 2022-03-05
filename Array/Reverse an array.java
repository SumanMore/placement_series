static void rvereseArray(int arr[],
                    int start, int end)
    {
        int temp;
          
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }   
