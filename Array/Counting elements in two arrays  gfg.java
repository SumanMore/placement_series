class Solution
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       ArrayList<Integer> ob=new ArrayList<Integer>();
       Arrays.sort(arr2);
       int c=0;
       for(int i=0;i<m;i++)
       {
           c=0;
           for(int j=0;j<n;j++)
           {
             if(arr1[i]>=arr2[j])
             {
                 c++;
             }
             else
             {
                 break;
             }
           }
           ob.add(c);
           
       }
       return ob;
    }
}
