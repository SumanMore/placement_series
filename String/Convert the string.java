Given string str, transform it according to the following rules:
Delete all the vowels from the string.
Insert # in front of all the consonants.
Change the case of all the letters of the string. 
  
  class Solution 
{ 
    String transform(String str) 
    {
        // code here
        
        String res="";
        int p=-1;
        for(int i=0;i< str.length();i++)
        {
          
            if(str.charAt(i)!='A'&&str.charAt(i)!='E'&&str.charAt(i)!='I'
             &&str.charAt(i)!='O'&&str.charAt(i)!='U'&&str.charAt(i)!='a'&&str.charAt(i)!='e'
             &&str.charAt(i)!='i'
             &&str.charAt(i)!='o'&&str.charAt(i)!='u')
             {
             
              p=0;
              if(str.charAt(i)>=65 && str.charAt(i)<=90)
              {
                  res=res+"#"+Character.toLowerCase(str.charAt(i));
              }
              else
              {
                 res=res+"#"+ Character.toUpperCase(str.charAt(i));
              }
              }
              
        }
        if(p==-1)
        {
            return "-1";
        }
        return res;
    }
}
