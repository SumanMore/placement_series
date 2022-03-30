class Solution{
    static int swapNibbles(int N) {
        //code here
         String temp = Integer.toBinaryString(N);
         while(temp.length()<8)
         {
              temp="0"+temp;
         }
         String s1 = temp.substring(0,4);
         String s2 = temp.substring(4,temp.length());
         Integer ans = Integer.parseInt(s2+s1,2);
        return ans;
         
    }
}
