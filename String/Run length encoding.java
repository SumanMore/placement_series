
class GfG
 {
	String encode(String str)
	{
          //Your code here
          int c=1;
          String s="";
          for(int i=0;i<str.length()-1;i++)
          {
              for(int j=i+1;j<str.length();j++)
              {
                  if(str.charAt(i)!=str.charAt(j))
                  {
                      c=1;
                  }
                  else
                  {
                      c=c+1;
                  }
              }
             
             s=s+str.charAt(i)+c; 
          }
       return s;   
	}
	
 }
