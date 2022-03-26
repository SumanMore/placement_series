class Solution {
    public int editDistance(String s, String t) {
        // Code here
        int t1[][]=new int[s.length()+1][t.length()+1];
        for(int i=0;i<=s.length();i++)
        {
            t1[i][0]=i;
        }
        
    for(int i=0;i<=t.length();i++)
        {
            t1[0][i]=i;
        }
        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=t.length();j++)
            {
                if(s.charAt(i-1) == t.charAt(j-1))
                {
                    t1[i][j]=t1[i-1][j-1];
                }
                 else
                 {
                     t1[i][j]=(Math.min(t1[i][j-1],Math.min(t1[i-1][j],t1[i-1][j-1])))+1; 
                 }
        }
        }
        return t1[s.length()][t.length()];
       
    }
}
