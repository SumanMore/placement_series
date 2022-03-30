class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long x){
        
         return  x!=0 && ((x&(x-1)) == 0);
        
    }
    
}
