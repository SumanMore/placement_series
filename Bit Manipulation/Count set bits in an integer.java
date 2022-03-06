class Solution {
    static int setBits(int N)
    {
     int res = 0;
while ( N != 0) {
res += (N & 1) ;
N >>>= 1;}

return res; 
       
    
}}
