Given an array of N positive integers where all numbers occur even number of times except one number which occurs odd number of times. Find the exceptional number.
  
  
  class Solution {
    int getOddOccurrence(int[] arr, int n) {
        // code here
        int oddValue=0;
         for(int i=0;i<n;i++){
           oddValue ^= arr[i];
       }
       return oddValue;
    }
}
