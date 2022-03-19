class Solution
{
    public static int count(Node head, int search_for)
    {
        //code here
        int res=0;
        if(head==null)
        {
            return res;
        }
        else
        {
            while(head!=null)
            {
                if(head.data==search_for)
                {
                   res++; 
                }
                head=head.next;
            }
        }
        return res;
    }
    
}
