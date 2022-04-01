class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
         String res = "";
        
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        
        for(int i=0;i<s1.length();i++){
            set1.add(s1.charAt(i));
        }
        
        for(int i=0;i<s2.length();i++){
            set2.add(s2.charAt(i));
        }
        
        for(int i=0;i<s1.length();i++){
            if(!set2.contains(s1.charAt(i))){
                res += s1.charAt(i);
            }
        }
        
        for(int i=0;i<s2.length();i++){
            if(!set1.contains(s2.charAt(i))){
                res += s2.charAt(i);
            }
        }
        
        if(res.length()>0){
            return res;
        }else{
            return "-1";
        }
    }
}
