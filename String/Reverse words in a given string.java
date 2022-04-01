class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
      String s[]=S.split("\\.");
      String rev="";
      for(int i=s.length-1;i>=0;i--)
      {
          rev=rev+s[i]+".";
      }
      return rev.substring(0,rev.length()-1).toString();


    }
}
