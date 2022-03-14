class Solution {
    public int findExtra(int a[], int b[], int n) {
        // add code here.
        int p=0;
        
        for(int i=0;i<n-1;i++)
        {
            if(a[i]!=b[i])
            {
               p=i;
               break;
            }
        }
        if(a[a.length-1]!=b[b.length-1])
        {
            p=a.length-1;
        }
        return p;
    }
}
