class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashSet<Long> ob=new HashSet<Long>();
        for(int i=0;i<n;i++)
        {
            if(!ob.contains(a1[i]))
            {
                ob.add(a1[i]);
            }
        }
        for(int i=0;i<m;i++)
        {
            if(!ob.contains(a2[i]))
            {
                return "No";
            }
        }
        return "Yes";
    }
}
