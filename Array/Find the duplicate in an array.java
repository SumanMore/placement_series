class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ob =new ArrayList<Integer>();
        int count=1;
        Arrays.sort(arr);
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {   count++;
                   if(count==2)
                   ob.add(arr[i]);
               }
                   else{
                   count =1;
               }
        }
       
        if(ob.isEmpty())
        {
            ob.add(-1);
        }
       
        return ob;

    }
}
