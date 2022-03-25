class Solution {
    public long count(int S[], int m, int n) {
      long t[][]=new long[m+1][n+1];
     for(int i=0;i<n+1;i++)
           t[0][i]=0;
       for(int i=0;i<m+1;i++)
           t[i][0]=1;
       for(int i=1;i<m+1;i++){
           for(int j=1;j<n+1;j++){
               if(S[i-1]<=j)
                   t[i][j]= t[i-1][j]+t[i][j-S[i-1]];
               else
                     t[i][j]= t[i-1][j];
           }
       }
       return t[m][n];
    }
}
