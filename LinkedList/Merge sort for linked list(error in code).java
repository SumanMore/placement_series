class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // add your code here
        MergeSorting(head);
        return head;
    }
    static void MergeSorting(Node head)
    {
        Node curr=head;
        Node first=head;
        Node second=head;
        if(curr==null || curr.next==null)//if(!curr || !curr.next)
        {
            return ;
        }
        FindMiddle(curr,first,second);
        MergeSorting(first);
        MergeSorting(second);
        head=MergeBoth(first,second);
    }
    static void FindMiddle(Node curr,Node first,Node second)
    {
        Node fast;
        Node slow;
        slow=curr;
        fast=curr.next;
        while(fast!=null){
            fast=fast.next;
            if(fast!=null)
            {
                slow=slow.next;
                fast=fast.next;
            }
        }
        first=curr;
        second=slow.next;
        slow.next=null;
    }
   static Node  MergeBoth(Node first, Node second)
    {
        Node ans=null;
        if(first==null)//if(!first)
        {
            return second;
        }
        else if(second==null)//if(!second
        {
            return first;
        }
        if(first.data<=second.data)
        {
            ans=first;
            ans.next=MergeBoth(first.next,second);
            
        }
        else
        {
             ans=second;
            ans.next=MergeBoth(first,second.next);
        }
        return ans;
    }
}
