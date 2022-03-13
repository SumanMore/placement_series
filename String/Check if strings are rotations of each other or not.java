class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        return (s1.length()==s2.length()) && (s2+s2).contains(s1);
    }
    
}
