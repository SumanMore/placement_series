int fib(int n)
{
  int ar[]=new int[n];
  ar[0]=0;
  ar[1]=1;
  for(int i=2;i<=n;i++)
  {
    a[i]=a[i-1]+a[i-2];
  }
  return a[n];
}
