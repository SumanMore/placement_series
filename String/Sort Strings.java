Given a string S, sort it in the following manner. Sorted string must contain a vowel as first letter and a consonant as next letter and so on OR a consonant as first letter and a vowel as next letter and so on, depending on the string. If there is no vowel left then print the remaining consonant in ascending order and vice versa. 

Note: Order of vowel must be a->e->i->o->u and order of consonant must be b->c->d... and so on.
  
  
  class Solution
{
    public String SortedString(String str){
        // Code here
        char ch[]=new char[str.length()];
        int index=0;
        ArrayList<Character> ob=new ArrayList<Character>();
         ArrayList<Character> ob1=new ArrayList<Character>();
         for(int i=0;i<str.length();i++)
         
         {
             if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
             ||str.charAt(i)=='o'||str.charAt(i)=='u')
             {
               ob.add(str.charAt(i));  
             }
         else
         {
               ob1.add(str.charAt(i));  
             }
         }
       Collections.sort(ob);
         Collections.sort(ob1);
         for(int i=0;i<ob.size()||i<ob1.size();i++)
         {
            if(str.charAt(0)=='a'||str.charAt(0)=='e'||str.charAt(0)=='i'
             ||str.charAt(0)=='o'||str.charAt(0)=='u')
             {
            
              if(i<ob.size())
             {
                 ch[index++]=ob.get(i);
             }
              if(i<ob1.size())
             {
                 ch[index++]=ob1.get(i);
             }
             }else
             {
                if(i<ob1.size())
             {
                 ch[index++]=ob1.get(i);
             }  
             if(i<ob.size())
             {
                 ch[index++]=ob.get(i);
             }
             }
         }
         
         String res=new String(ch);
         return res;
        
    }
}
