class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
       HashSet<Integer> ob=new HashSet<Integer>();
       
       HashSet<Integer> set=new HashSet<Integer>();
       int count=0;
       for(int i=0;i<head1.size();i++)
       {
           set.add(x-head1.get(i));
       }
       for(int val : head2)
       {
           if(set.contains(val))
           {
               count++;
           }
       }
       return count;
}
}
