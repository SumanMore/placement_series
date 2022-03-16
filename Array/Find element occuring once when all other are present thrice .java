class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
        
       /* int k=0,res=0;
        for(int i=0;i<N;i++)
        {
            k=0;
            for(int j=0;j<N;j++)
            {
                if(arr[i]==arr[j])
                {
                    k++;
                }
            }
            if(k==1)
            {
                res=arr[i];
            }
    }
        return res;*/
        HashSet<Integer> ob = new HashSet<Integer>();
        for (int i : arr) {
            ob.add(i);
        }
 
        int arr_sum = 0;
        for (int i : arr) {
            arr_sum += i;
        }
 
        int set_sum = 0;
        for (int i : ob) 
        {
            set_sum += i;
        }
 
        
        return (3 * set_sum - arr_sum) / 2;
    }
};
