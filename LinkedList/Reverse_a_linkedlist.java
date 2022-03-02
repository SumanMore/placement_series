class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node n = null,finalist=null;
        Node temp=head;
        while(temp!=null)
        {
            n=temp.next;
            temp.next=finalist;
            finalist=temp;
            temp=n;
        }
        head=finalist;
        return head;
    }
}
