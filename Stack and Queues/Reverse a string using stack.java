class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> ob=new  Stack<Character>();
      
        String str="";
        for(int i=0;i<S.length();i++)
        {
            
            ob.push(S.charAt(i));
         
            
        }
        while(ob.size()!=0){
           
            str=str+ob.pop();
        }
        return str;
    }

}

or
class Solution {
    
    public String reverse(String S){
        //code here
        String str="";
        Stack<Character> ob=new Stack<Character>();
        for(int i=0;i<S.length();i++)
        {
            ob.push(S.charAt(i));
        }
         for(int i=0;i<S.length();i++)
        {
           str=str+ob.pop();
        }
        return str;
    }

}
