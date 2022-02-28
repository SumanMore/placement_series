class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        HashSet<Integer> ob= new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            int c=x-arr[i];
            if(ob.contains(c))
            
            {
                return true;
               // System.out.print(arr[i]+" "+c);
            }
            else
            {
                ob.add(arr[i]);
            }
        }
        return false;
    }
}
