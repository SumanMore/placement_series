Error:
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

//Correct one
int length(Node head)
{
	int l=0;
	Node temp=head;
	while(temp!=null)
	{
		l++;
		temp=temp.next;
	}
	return l;
}
int intersect(Node head1,Node head2)
{
	int l1=length(head1);
	int l2=length(head2);
	int d=0;
	Node ptr1;
	Node ptr2;
	if(l1>l2)
	{
		d=l1-l2;
		ptr1=head1;
		ptr2=head2;
	}
	else
	{      
		d=l2-l1;
		ptr1=head2;
		ptr2=head1;
	}
	while(d)
	{
		ptr1=ptr1.next;
		if(ptr1==null)
		{
			return -1;
		}
		d--;
	}
	while(ptr1!=null && ptr2!=null)
	{
		if(ptr1==ptr2)
		{
			return ptr1.data;
		}
		ptr1=ptr1.next;
		ptr2=ptr2.next;
	}
	return -1;
}
	
