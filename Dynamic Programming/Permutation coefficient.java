int abc(int n,int k)
{
  int fact[n+1];
  fact[0]=1;
  for(int i=1;i<=n;i++)
   
  {
    fact[i]=i*fact[i-1];
  }
  return gact[n]/fact[n-k];
}
