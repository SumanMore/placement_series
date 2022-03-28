class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
         int table[][]=new int[S.length()][S.length()];
        for(int i = 0 ; i < S.length(); i++)
        {
        table[i][i] = 1;
        }
    for(int l = 1 ; l < S.length() ; l++){
        int i = 0, j = l;
        while(j != S.length())
        {
            if(S.charAt(i) == S.charAt(j))
            {
                table[i][j] = 2 + table[i+1][j-1];
            }
            else
            {
                table[i][j] = Math.max(table[i+1][j],table[i][j-1]);
            }
            i++;j++;
        }
    }
    return table[0][S.length()-1];
    }
}
