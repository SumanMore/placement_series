class Solution{
    int middle(int A, int B, int C){
        //code here
        if(A>B && A<C || A>C && A<B )
        {
            return A;
        }
        else  if(B>A && B<C || B>C && B<A)
        {
            return B;
        }
        return C;
    }
}
