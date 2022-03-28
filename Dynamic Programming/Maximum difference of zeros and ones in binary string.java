Maximum difference of zeros and ones in binary string


class Solution {
    int maxSubstring(String S) {
         int ans = 0;
	    int temp = 0;
	    for(int i=0;i<S.length();i++)
	    {
	        if(S.charAt(i)=='0')
	        {
	            temp++;
	        }
	        else
	        {
	            temp--;
	        }
	        ans = Math.max(ans,temp);
	        if(temp<0)
	        {
	            temp = 0;
	        }
	    }
	    return ans==0?-1:ans;
    }
}
