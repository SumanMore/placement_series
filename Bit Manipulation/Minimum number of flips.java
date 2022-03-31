Given a binary string, that is it contains only 0s and 1s. We need to make this string a sequence of alternate characters by flipping some of the bits, our goal is to minimize the number of bits to be flipped.
  
class Solution {
    public int minFlips(String S) {
        // Code here
        int fir=0,sec=0;
       
        
        for(int i=0;i<S.length();i++){
            if(i%2==0)
            {
                
                if(S.charAt(i)!='0')
                    fir++;
            }
            else
            {
                if(S.charAt(i)!='1')
                   fir++;
            }
        }
        
        for(int i=0;i<S.length();i++){
            if(i%2==0)
            {
                if(S.charAt(i)!='1')
                   sec++;
            }
            else
            {
                if(S.charAt(i)!='0')
                   sec++;
            }
        }
               
        return Math.min(fir,sec);
    }
}
  
  
