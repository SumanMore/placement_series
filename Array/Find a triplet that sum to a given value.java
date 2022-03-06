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

static boolean find3Numbers(int A[],
                                int arr_size, int sum)
    {
        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {
 
            // Find pair in subarray A[i+1..n-1]
            // with sum equal to sum - A[i]
            HashSet<Integer> s = new HashSet<Integer>();
            int curr_sum = sum - A[i];
            for (int j = i + 1; j < arr_size; j++)
            {
                if (s.contains(curr_sum - A[j]))
                {
                    System.out.printf("Triplet is %d,
                                        %d, %d", A[i],
                                      A[j], curr_sum - A[j]);
                    return true;
                }
                s.add(A[j]);
            }
        }
 
        // If we reach here, then no triplet was found
        return false;
    }
