class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> ob=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            ob.add(a[i]);
        }
        for(int i=0;i<m;i++)
        {
            ob.add(b[i]);
        }
        return ob.size();
        
    }
}
