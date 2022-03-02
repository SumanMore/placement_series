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

  
  
  
  or

    
    class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code 
        HashSet<Node> hs=new HashSet<>();
        while(head!=null)
        {
            if(hs.contains(head)) 
               return true;
            hs.add(head);
            head = head.next;
         }
        return false;
        
    }
}

  Node check_loop(Node head)
{
  Node low=head;
  Node high=head;
  while(high !=null && high.next!=null)
  {
    low=low.next;
    high=high.next.next;
    if(low==high)
    {
      return true;
    }}
    return false;
  }
