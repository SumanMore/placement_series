class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
      long max=a[0],min=a[0];
      for(int i=1;i<n;i++)
      {
          if(a[i]<min)
          {
              min=a[i];
          }
          if(a[i]>max)
          {
              max=a[i];
          }
      }
      pair ans=new pair(min,max);
      return ans;
    }
}
