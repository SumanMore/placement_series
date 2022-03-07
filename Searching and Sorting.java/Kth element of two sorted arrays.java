class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        ArrayList<Integer> ob=new ArrayList<Integer>();
         ArrayList<Integer> ob1=new ArrayList<Integer>();
         for(int i=0;i<n;i++)
         {
             ob.add(arr1[i]);
             
         }
        
         for(int i=0;i<m;i++)
         {
             ob1.add(arr2[i]);
             
         }
         
       ob.addAll(ob1);
       Collections.sort(ob);
      return (long)ob.get(k-1);
        
        
    }
}
