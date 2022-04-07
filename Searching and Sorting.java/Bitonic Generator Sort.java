class Solution
{
    void bitonicGenerator(long arr[], int n)
    {
        ArrayList<Long> ob1=new ArrayList<Long>();
        ArrayList<Long> ob2=new ArrayList<Long>();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                ob1.add(arr[i]);
            }
            else
            {
                ob2.add(arr[i]);
            }
        }
        Collections.sort(ob1);
        Collections.sort(ob2);
        Collections.reverse(ob2);
        ob1.addAll(ob2);
       for(int i=0;i<n;i++)
       {
           arr[i]=ob1.get(i);
       }
        
        
    }
}

