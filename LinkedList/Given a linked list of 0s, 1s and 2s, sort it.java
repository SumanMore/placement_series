class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node i , j;
        for ( i=head;i.next!=null;i=i.next)
        {
           for ( j=head;j.next!=null;j=j.next)
            {
            if(j.data>j.next.data)
            {
                int temp=j.data;
                j.data=j.next.data;
                j.next.data=temp;
            }
            } 
            
        }
        return head;
    }
}
