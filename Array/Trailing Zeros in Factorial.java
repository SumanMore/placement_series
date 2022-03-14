class Solution{
    static int trailingZeroes(int N){
       if(N<=0) 
           return 0;
        return N/5+trailingZeroes(N/5);
    }
}
