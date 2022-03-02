Node starting+point(Node head)
{

Node low=head;
Node high=head;
while(low!=null && high !=null && high.next!=null)
{
  low=low.next;
  high=high.next.next;
  if(low==high)
  {
    break;
  }}
  if(low!=high)
     return null;
  low=head;
  while(low!=high)
  {
    low=low.next;
    high=high.next;
  }
  return low;
}
