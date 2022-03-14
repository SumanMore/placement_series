class Solution {
    static long nthPosition(long n){
        if(n==1)
        {
            return 1;
        }
        return nthPosition(n/2)*2;
    }
}
