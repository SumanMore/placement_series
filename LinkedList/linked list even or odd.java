class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	    //Add your code here.
	    int c=0;
	    while(head1!=null)
	    {
	        c++;
	        head1=head1.next;
	    }
	    if(c%2==0)
	    {
	        return 0;
	    }
	    return 1;
	}
}
