class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int res=a^b;
        int count=0;
        while(res!=0)
        {
            count++;
            res=res&(res-1);
        }
        return count;
        
    }
    
    
}

