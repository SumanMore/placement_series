Node p,q;
p=null, q=head;
while(p.next!=null)
{
  q=p;
  p=p.next;
}
q.next=null;
p.next=head;
head=p;

