class GfG
{
    int length(Node head)
    {
        int c=0;
        Node temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
        
    }
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code her
    	int pos=length(head)-n;
    	while(pos!=0)
    	{
    	    if(head==null)
    	    {
    	        return -1;
    	    }
    	    head=head.next;
    	    pos--;
    	}
    	return head.data;
    
    }
}
