class GfG{
    public int count(String s)
    {
        //add code here.
         int max = 0, count = 0, len = s.length();
        for(int i = 0; i < len; i++){
           if(s.charAt(i) == '1'){
               count ++;
               max = Math.max(count,max);
           }
           else count = 0;
       }
       return max;
    }
}
