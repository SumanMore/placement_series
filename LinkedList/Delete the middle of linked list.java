class Solution {
    Node deleteMid(Node head) {
       
      int l=length(head);
      Node curr=head;
      for(int i=1;i<Math.ceil(l/2);i++)
      {
          curr=curr.next;
      }
      curr.next=curr.next.next;
      return head;
    }
    int length(Node head)
    {
        Node temp=head;
        int c=0;
        while(temp!=null)
        {
          c++;
          temp=temp.next;
        }
        return c;
    }
}
