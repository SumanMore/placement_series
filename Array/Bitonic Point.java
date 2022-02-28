class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        return arr[n-1];
    }
}



class Solution {
    int findMaximum(int[] arr, int n) {
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        return max;
    }
}
