class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
     long ans = 0;
      
       
        for (int i = 0; i < n-2; i++)
        {
          
           for (int j = i+1; j < n-1; j++)
           {
               for (int k = j+1; k < n; k++)
                   if (arr[i] + arr[j] + arr[k] < sum)
                       ans++;
           }
        }
      
        return ans;
    }
}



or


long long countTriplets(long long arr[], int n, long long sum)
	{
	    // Your code goes here
	     int counter=0;
	    sort(arr,arr+n);
	   for(int k=0;k<n-2;k++){
	       int i=k+1;
	       int j=n-1;
	       while(i<j){
	           int temp_sum=arr[k]+arr[j]+arr[i];
	           if(temp_sum<sum){
	               counter+=(j-i);
	               i++;
	           }else j--;
	       }
	   }
	   return counter;
