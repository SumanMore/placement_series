class Solution
{
    int search(int A[], int l, int h, int key)
    {
        // Complete this function
        int p=-1;
        for(int i=0;i<A.length;i++)
        {
            if(key==A[i])
            {
                p=i;
                break;
            }
        }
        return p;
    }
}
