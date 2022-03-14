long long findMissing(long long a[], long long b[], int n)
   {
       long long sum = 0;
       for(int i=0;i<n;i++){
           sum += a[i];
       }
       for(int i=0;i<n-1;i++){
           sum -= b[i];
       }
       return sum;
}
