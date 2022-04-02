


Given two strings consisting of lowercase english alphabets, the task is to check whether these strings are meta strings or not.
Meta strings are the strings which can be made equal by exactly one swap in any of the strings. Equal string are not considered here as Meta strings.





class Solution 
{ 
    boolean metaStrings(String s1, String s2) 
    { 
        // code here
         int x=s1.length();
    int count=0;
    if(s1==s2){
        return false;
    }
    else{
        for(int i=0;i<x;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
        
    }
  }
} 


