Node remove_duplicates(Node root)
{
  Node head=root;
  while(head!=null)
  {
    if(head.data==head.next.data)
    {
      head.next=head.next.next;
    }
    else
    {
      head=head.next;
    }
  }
  return root;
}
