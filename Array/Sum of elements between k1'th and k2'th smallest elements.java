class Solution { 
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        // Your code goes here

 long sum = 0;
        Arrays.sort(A);
        for(long i = K1;i<K2-1;i++){
            sum = sum+A[(int)i];
        }
        return sum;
    }
    
    
}
