class Solution
{
    int atoi(String str)
    {
        int c=0,res=-1;
	// Your code here
	for(int i=0;i<str.length();i++)
	{
	    if(Character.isDigit(str.charAt(i))||str.charAt(i)=='-')
	    {
	        c++;
	    }
	}
	
	if(c==str.length())
	{
	   
	  int r=0;
int i=str.charAt(0)=='-'? 1:0;
for(int j=i;j<str.length();j++)
{
int d=str.charAt(j)-'0';
r= r*10+d;
}
if(i==1)
  res=-r;
else
  res=r;  
}
	   
	
	else
	{
	   res=-1; 
	}
	return res;
    }
    
}
