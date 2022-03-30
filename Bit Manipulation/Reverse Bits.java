class Solution {
    static Long reversedBits(Long X) {
       
        
        
        String str = "";
      
      while(X>0)
      {
          long rem = X%2;
          str += rem;
          X /= 2;
      }
      while(str.length()!=32){
          str += 0;
      }
      
      return Long.parseLong(str,2);
    }
};
