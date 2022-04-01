class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        if(a.length()!=b.length())
        {
            return false;
        }
        char ch[]=a.toCharArray();
        char ch1[]=b.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=ch1[i])
            {
                return false;
            }
        }
        return true;
        
    }
}
