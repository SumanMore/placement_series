class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
       ArrayList<Integer> ob=new ArrayList<Integer>();
       int i,k=0,l=0;
       int lastrow=r-1;
        int lastcolumn=c-1;
        while(k<=lastrow && l<=lastcolumn)
        {
            for(i=l;i<=lastcolumn;i++)
            {
                ob.add(matrix[k][i]);
            }
            k++;
            for(i=k;i<=lastrow;i++ )
            {
                ob.add(matrix[i][lastcolumn]);
            }
            lastcolumn--;
            if(k<=lastrow)
            {
                for(i=lastcolumn;i>=l;i--)
                {
                    ob.add(matrix[lastrow][i]);
                }
                lastrow--;
                
            }
            if(l<=lastcolumn)
            {
                for(i=lastrow;i>=k;i--)
                {
                    ob.add(matrix[i][l]);
                }
                l++;
            }
        }
        return ob;
    
    }
}
