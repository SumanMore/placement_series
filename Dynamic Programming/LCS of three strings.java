int LCSof3 (string A, string B, string C, int n1, int n2, int n3)
{
     int t[m+1][n+1][s+1];
   
   for(int i=0;i<=m;i++){
       for(int j=0;j<=n;j++){
           for(int k=0;k<=s;k++){
               if(i==0 || j==0 || k==0){
                   t[i][j][k]=0;
               }
               else if(A[i-1]==B[j-1] && A[i-1]==C[k-1] && B[j-1]==C[k-1]){
                   t[i][j][k]=t[i-1][j-1][k-1]+1;
               }
               else{
                   t[i][j][k]=max(t[i-1][j][k],max(t[i][j-1][k],t[i][j][k-1]));
               }
           }
       }
   }
   return t[m][n][s];
        
}
