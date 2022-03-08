class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        int []arr=new int[N*N];
       int index=0;
       for(int i=0;i<N;i++){
           for(int j=0;j<N;j++){
                 arr[index]=Mat[i][j];
                 index++;
           }
       }
       Arrays.sort(arr);
       index=0;
       for(int i=0;i<N;i++){
           for(int j=0;j<N;j++){
               Mat[i][j]=arr[index];
               index++;
           }
       }
       return Mat;
    }
};
