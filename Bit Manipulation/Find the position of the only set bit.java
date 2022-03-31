class Solution {
    static int findPosition(int n)
    {
     String s=Integer.toBinaryString(n);
    int res=-1;
    int c=0;
    for(int i=s.length()-1;i>=0;i--)
    {
      
       if(s.charAt(i)=='1')
       {
          res=s.length()-i;
          c++;
       }
        
    }
    if(c>1)
    {
        res= -1;
    }
    return res;
         
             
               

       
       
       
}   
};
