class Compute {
    long countSubsets(int a[], int n) {
        // code here
        HashSet<Integer> ob=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            if(!ob.contains(a[i]) && a[i]%2==0)
            {
                ob.add(a[i]);
            }
        }
        int l=ob.size();
        return ((long)Math.pow(2,l))-1;
    }
}
