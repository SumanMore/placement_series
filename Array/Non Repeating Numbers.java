class Solution
{
    public int[] singleNumber(int[] arr)
    {
        int N=arr.length;
      int k=0;
      int res[]=new int[2];int l=0;
        for(int i=0;i<N;i++)
        {
            k=0;
            for(int j=0;j<N;j++)
            {
                if(arr[i]==arr[j])
                {
                    k++;
                }
            }
            if(k==1)
            {
                res[l++]=arr[i];
            }
        }
        Arrays.sort(res);
        return res;
    }
}
