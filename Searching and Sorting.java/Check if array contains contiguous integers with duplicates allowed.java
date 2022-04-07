class Solution{
    // Function for finding maximum and value pair
    public static boolean areElementsContiguous (int arr[], int n) {
        //Complete the function
        HashSet<Integer> ob=new HashSet<Integer>();
        
        for(int i=0;i<n;i++)
        {
            ob.add(arr[i]);
        }
        ArrayList<Integer> ob1=new ArrayList<Integer>(ob);
        Collections.sort(ob1);
       for( int i = 1 ; i<ob1.size() ; i++)
        {
           if(ob1.get(i)-ob1.get(i-1) != 1)
            {
              return false ;
            }
        }
      return true ;
    }
}
