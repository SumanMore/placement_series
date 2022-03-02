class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        int ans=0;
        //Code here
        if(head==null)
           return ans;
        else
        {
            while(head!=null)
            {
                ans++;
                head=head.next;
            }
        }
        return ans;
    }
}
    
