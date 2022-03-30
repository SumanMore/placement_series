void toBinary(int N)
{
    // your code here
       if(N==0)
          return;
   toBinary(N/2);
   int r=N%2;
   printf("%d",r);
        
}
