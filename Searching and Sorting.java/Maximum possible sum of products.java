class Solution 
{ 
    long MaxSum(long []A, long []B, int N) 
    { 
        // code here
        Arrays.sort(A);
       Arrays.sort(B);
       
       long prod = 0;
       for(int i=0;i<N;i++){
           prod = prod + A[i] * B[i];
       }
       return prod;
    }
} 
