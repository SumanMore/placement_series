Node check_loop(Node head)
{
  Node o=head;
  Node q=head;
  while(p && q && q.next)
  {
    p=p.next;
    q=q.next.next;
    if(p==q)
    {
      return p;
    }
    return null;
  }
  Node start_loop(Node p,Node head)
  {
    Node q=head;
    while(p!=q)
    {
      p=p.next;
      q=q.next;
    }
    return p;
  }
