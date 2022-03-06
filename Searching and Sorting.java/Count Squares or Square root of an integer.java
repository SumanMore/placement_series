
class Solution {
   
    static int countSquares(int N) {
        // code here
        int c=(int)Math.sqrt(N);
       if(c*c==N)
        return c-1;
       return c;
    }
}
