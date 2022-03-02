class Solution
{
    int getMiddle(Node head)
    {
     Node p=head;
     Node q=head;
     while(q!=null && q.next!=null)
     {
         p=p.next;
         q=q.next.next;
         
     }
     return p.data;
    }
}
