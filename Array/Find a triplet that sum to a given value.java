boolean find3Numbers(int A[], int arr_size, int sum)
    {
        int l, r;
 
        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {
 
            // Fix the second element as A[j]
            for (int j = i + 1; j < arr_size - 1; j++) {
 
                // Now look for the third number
                for (int k = j + 1; k < arr_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
                        return true;
                    }
                }
            }
        }
 
        // If we reach here, then no triplet was found
        return false;
    }

or

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       int j;
    for(int i=0;i<n-2;i++)
    {
        HashSet<Integer> ob=new HashSet<Integer>();
        int curr=X-A[i];
        for( j=i+1;j<n;j++)
        {
            if(ob.contains(curr-A[j]))
            {
                return true;
            }
             ob.add(A[j]);
        }
       
    }
    return false;
    }
}
