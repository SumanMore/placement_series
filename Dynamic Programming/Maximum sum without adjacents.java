
Given an array Arr of size N containing positive integers. Find the maximum sum of a subsequence such that no two numbers in the sequence should be adjacent in the array.



class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        int inclusive=arr[0];
        int exclusive=0,temp;
        int i=1;
        while(i!=n)
        {
          temp=inclusive;
          inclusive=Math.max(inclusive,arr[i]+exclusive);
          exclusive=temp;
          i++;
        }
        return inclusive;
    }
}
