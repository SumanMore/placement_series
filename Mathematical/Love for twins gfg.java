class Solution {
    static int getTwinCount(int N , int[] Arr) {
        // code here
        Arrays.sort(Arr);
        int k=0;
        for(int i=0;i<N-1;i++)
        {
            if(Arr[i]==Arr[i+1])
            {
                i++;
                k+=2;
            }
        }
        return k;
    }
};
