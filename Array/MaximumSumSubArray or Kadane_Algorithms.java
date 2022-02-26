int maxsubArraysum(int a[],int size)
{
  int max_so_far=Integer.MAX_VALUE;//int max_so_far=a[0];
  int max_ending_here=0;
  for(int i=0;i<size;i++)
  {
    max_ending_here=max_ending_here+a[i];
    if(max_so_far<max_ending_here)
    {
      max_so_far=max_ending_here;
    }
    if(max_ending_here<0)
    {
      max_ending_here=0;
    }
    return max_so_far;
  }}
