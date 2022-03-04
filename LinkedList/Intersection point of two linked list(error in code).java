class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         if(head1==null||head2==null)
            return -1;
         Node p=head1;
         Node q=head2;
         while(p!=q)
         {
             p=(p==null)?head1:p.next;
               q=(q==null)?head2:q.next;
         }
         return q.data;
	}
}
