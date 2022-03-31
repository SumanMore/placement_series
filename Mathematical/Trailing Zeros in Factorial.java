class Solution{
    static int trailingZeroes(int n){
        int i=1,c=0;
        int d=n;
        while(n!=0)
        {
            n=(int)Math.floor(d/Math.pow(5,i));
            i++;c=c+n;
        }
        return c;
    }
}
