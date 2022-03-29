int smallestSubarraySum(int a[], int n){
	
	int sum = 0;
	int ans = INT_MAX;
	for(int i = 0 ; i < n ; ++i){
		sum = min(a[i], a[i] + sum);
		ans = min(ans, sum);
	}
	
	return ans;
}


or



// Java implementation to find the smallest sum 
// contiguous subarray 
class GFG { 
      
    // function to find the smallest sum contiguous 
    // subarray 
    static int smallestSumSubarr(int arr[], int n) 
    { 
          
        // to store the minimum value that is  
        // ending up to the current index 
        int min_ending_here = 2147483647; 
          
        // to store the minimum value encountered 
        // so far 
        int min_so_far = 2147483647; 
          
        // traverse the array elements 
        for (int i = 0; i < n; i++) 
        { 
              
            if (min_ending_here > 0) 
                min_ending_here = arr[i]; 
            
            else
                min_ending_here += arr[i]; 
          
            min_so_far = Math.min(min_so_far, 
                                   min_ending_here);          
        } 
          
      
        return min_so_far; 
    } 
      
