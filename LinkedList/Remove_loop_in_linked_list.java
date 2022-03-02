class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        HashSet<Node> ob =new HashSet<>();
    Node prev=null;
    Node curr=head;
    while(curr!=null)
    {
        if(ob.contains(curr))
        {
            prev.next=null;
            return;
        }
        ob.add(curr);
        prev=curr;
        curr=curr.next;
    }
    }
}


or

Node low=head;
Node high=head;
while(low!=null && high!=null && high.next!=null)
{
  low=low.next;
  high=high.next.next;
  if(low==high)
  {
    break;
  }
}
if(low==head)
{
  while(high.next!=low)
  {
    high=high.next;
  }
  high.next=null;
}
else if(low==high)
{
  low=head;
  while(low.next!=high.next)
  {
    low=low.next;
    high=high.next;
  }
  high.next=null;
}
