class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        return arr[n-1];
    }
}
