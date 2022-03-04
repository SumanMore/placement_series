class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
         int c1=0;
        int c2=0;
           Node temp=head1;Node temp1=head2;
        while(head1!=null || head2!=null)
        {
     
       
        while(temp!=null)
        {
            c1++;
            temp=temp.next;
        }
       
        while(temp1!=null)
        {
            c2++;
            temp1=temp1.next;
        }
        }
        int d=Math.abs(c1-c2);
        int l=0;
        Node curr=null;
        int i,j;
        if(c1>c2)
        {
            l=c1;
            i=1;
            while(i<=l)
            {
              temp=temp.next;
              i++;
            }}
        else
        {
            l=c2;
            j=1;
            while(j<=l)
            {
              temp1=temp1.next;
              j++;
            }
            
        }
        
        while(temp!=temp1)
        {
            temp=temp.next;
            temp1=temp1.next;
        }
        return temp1;
    }
}
