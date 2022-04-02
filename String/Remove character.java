Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). Both the strings are different and contain only lowercase characters.
NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).
  
  
  class Solution{
    static String removeChars(String string1, String string2){
        // code here
        String res="";
        HashSet<Character> ob=new HashSet<Character>();
        for(int i=0;i<string2.length();i++)
        {
            ob.add(string2.charAt(i));
        }
        
         for(int i=0;i<string1.length();i++)
        {
            if(!ob.contains(string1.charAt(i)))
            {
                res=res+string1.charAt(i);
            }
        }
        return res;
        
    }
}
