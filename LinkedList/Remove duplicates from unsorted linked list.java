class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        HashSet<Integer> set = new HashSet<>();
       Node temp = head;
       set.add(temp.data);
       while(temp.next != null){
           if(!set.contains(temp.next.data)) {
               set.add(temp.next.data);
               temp = temp.next;
           }
           else{
               temp.next = temp.next.next;
           }
           
       }
       return head;
    }
}
