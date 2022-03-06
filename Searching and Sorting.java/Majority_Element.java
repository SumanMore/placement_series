import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int ar[]={2,2,1,1,1,2,2};
		int c=0;
		int n=ar.length;
		int k=(int)Math.floor(n/2);
		for(int i=0;i<ar.length;i++)
		{ 
		     c=0;
		    for(int j=0;j<ar.length;j++)
		    {
		        if(ar[i]==ar[j])
		        {
		            c++;
		        }
		    }
		    if(c>k)
		    {
		        System.out.println(ar[i]+" ");
		        break;
		    }
		}
	}
}



class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if(num==candidate)
            count += 1; 
            else count -= 1; 
        }

        return candidate;
    }
}
