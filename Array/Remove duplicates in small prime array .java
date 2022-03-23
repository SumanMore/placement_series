class Solution
{
    ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        // code here 
        HashSet<Integer> hs = new HashSet<Integer> ();
       ArrayList<Integer> arL = new ArrayList<Integer>();       
       for(int i=0; i<n; i++)
       {
           if(!hs.contains(arr[i]))
           {
               hs.add(arr[i]);
               arL.add(arr[i]);
           }
       }
       return arL;
    }
}
