class Solution {
    int remove_duplicate(int A[],int N){
        
         if(A.length==0)
        {
        return 0;
        }

int wi= 1;
for (int i = 1; i < N; ++i)
{
if (A [wi - 1]!=A[i])
{

A[wi]=A[i];
wi++;
}
}
return wi;
    }
