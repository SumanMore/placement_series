union:
1) Use two index variables i and j, initial values i = 0, j = 0 
2) If arr1[i] is smaller than arr2[j] then print arr1[i] and increment i. 
3) If arr1[i] is greater than arr2[j] then print arr2[j] and increment j. 
4) If both are same then print any of them and increment both i and j. 
5) Print remaining elements of the larger array.
  
  
  public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
   {
       
       HashSet<Integer> set=new HashSet<Integer>();
       for(int i=0;i<n;i++)
       {
          set.add(arr1[i]);
       }
       
       for(int i=0;i<m;i++)
       {
          set.add(arr2[i]);
       }
       
       ArrayList<Integer> list=new ArrayList<Integer>(set);
       
       Collections.sort(list);
       return list;
   }

or

static int printUnion(int arr1[], int arr2[], int m, int n)
    {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++] + " ");
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
 
        /* Print remaining elements of
         the larger array */
        while (i < m)
            System.out.print(arr1[i++] + " ");
        while (j < n)
            System.out.print(arr2[j++] + " ");
}

Intersection:
1) Use two index variables i and j, initial values i = 0, j = 0 
2) If arr1[i] is smaller than arr2[j] then increment i. 
3) If arr1[i] is greater than arr2[j] then increment j. 
4) If both are same then print any of them and increment both i and j.
  
  
  static void printIntersection(int arr1[], int arr2[], int m, int n)
    {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }
