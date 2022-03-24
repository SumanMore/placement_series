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

gfg solution
class Solution {
    static long nthFibonacci(long n){
        // code here
        long mod = 1000000007;
       long a=0, b=1,c,i;
       for (i=2;i<=n;i++){
           c=(a+b)%mod;
           a=b;
           b=c;
           
       }
       return b;
    }
}
