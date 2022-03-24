class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
         ArrayList<Integer> list = new ArrayList();
        Set<Integer> set = new HashSet<>();
        
        for(int i=0;i<n1;i++) {
            set.add(A[i]);
        }
        
        for(int i=0;i<n2;i++) {
            if(set.remove(B[i])){
                list.add(B[i]);
            }
        }
        
        set = new HashSet<>(list);
        list.clear();
        
        for(int i=0;i<n3;i++) {
            if(set.remove(C[i])) {
                list.add(C[i]);
            }
        }
        
        return list;
    }
}
