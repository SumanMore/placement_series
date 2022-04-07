class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        int ar[]=new int[N];
        int c=0;
        for(int i=0;i<N;i++)
        {
            c=0;
            for(int j=0;j<M;j++)
            {
                if(Mat[i][j]==1)
                {
                    c++;
                }
            }
            ar[i]=c;
        }
        int max=ar[0];
        int index=0;
        for(int i=1;i<N;i++)
        {
            if(ar[i]>max)
            {
                index=i;
                max=ar[i];
            }
        }
        return index;
    }
}
