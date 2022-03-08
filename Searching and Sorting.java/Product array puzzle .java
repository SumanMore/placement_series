class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long arr[]=new long[n];
        long p=1;
        for(int i=0;i<n;i++)
        {
            p=1;
           for(int j=0;j<n;j++)
           {
               if(i!=j)
               {
                   p=p*nums[j];
               }
           }
           arr[i]=p;
        }
       return arr; 
	} 
	
	
} 
