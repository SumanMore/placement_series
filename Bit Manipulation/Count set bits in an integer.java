class Solution {
    static int setBits(int N)
    {
     int res = 0;
while ( N != 0) {
res += (N & 1) ;
N >>>= 1;}

return res; 
       
    
}}

or 

public class Main
{
	public static void main(String[] args) 
	{
	 int count=0;
	 int n=2;
	 while(n!=0)
	 {
	     count++;
	     n=n&(n-1);
	     
	 }
	 System.out.println(count);
       
	}
}

