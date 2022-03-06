class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
         int currentSum = 0;


        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {

            // adding 0 to table
            set.add(currentSum);

            currentSum += arr[i];

            // checking the value
            if (set.contains(currentSum)) {
                return true;
            }


        }

        return false;
    }
}
