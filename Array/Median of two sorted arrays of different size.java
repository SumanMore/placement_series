class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        ArrayList<Integer> ob=new ArrayList<Integer>();
         ArrayList<Integer> ob1=new ArrayList<Integer>();
         for(int i=0;i<n;i++)
         {
             ob.add(a[i]);
         }
          for(int i=0;i<m;i++)
         {
             ob1.add(b[i]);
         }
         ob.addAll(ob1);
         Collections.sort(ob);
         int l=ob.size();
         double s;
         if(l%2==0)
         {
          s=(double)(ob.get(l/2)+ob.get(l/2 - 1))/2;
         }
         else
         {
            s=ob.get((int)Math.floor(l/2));
             
         }
         return s;
        
    }
}
