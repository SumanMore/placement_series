Remove Duplicates 
class Solution {
    String removeDups(String S) {
        // code here
         HashSet<Character> hs =new HashSet<>();
       String s ="";
       
       for(int i=0;i<S.length();i++)
   {
     if(!hs.contains(S.charAt(i)))
     {
           hs.add(S.charAt(i));
            s+=S.charAt(i);
      }
   }
   return s;
   
    }
}
