class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) 
    {
       
          
          
        HashSet<Integer> hs2 = new HashSet<>();
        int count = 0;
       
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
       {
           
           hs2.add(mat2[i][j]);
           
       }
       
       }
      
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
       {
           
           if(hs2.contains(x-mat1[i][j]))
           {
               count++;
           }
           
       }
       
       }
       return count;
       
   
    }
}
