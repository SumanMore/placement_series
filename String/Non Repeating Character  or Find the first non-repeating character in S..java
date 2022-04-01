class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
       char res='$';
				 for (int i=0;i<S.length();i++) 
				 {
					 char ch=S.charAt(i);
					 if(S.indexOf(ch)==S.lastIndexOf(ch))
					 {
						 res=ch;
						 break;
					 }
				}
				return res;
    }
}
