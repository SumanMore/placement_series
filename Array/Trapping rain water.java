class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int left[],right[];
        long water=0;
        left=new int[n];
        left[0]=arr[0];
        right=new int [n];
        right[n-1]=arr[n-1];
        for (int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],arr[i]);
        }
         for (int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],arr[i]);
        }
        
        for (int i=0;i<n;i++)
        {
            int height=Math.min(left[i],right[i]);
            if(height>=arr[i])
            water+=height-arr[i];
            
        }
        return water;
    } 
}

