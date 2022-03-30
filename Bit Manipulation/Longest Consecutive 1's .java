class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
        
        int mxCnt=0;
      int cnt=0;
      while(N!=0){
          if((N&1)==1){
             cnt++;
             mxCnt=Math.max(mxCnt , cnt);
          }
          else{
              cnt=0;
          }
          
       N>>=1;
      }
      
      return mxCnt;
    }
}
