class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here
	Node temp=head;
if(x==1)
{
    return head.next;
}
for(int i=1;i<x-1;i++)
{
    temp=temp.next;
}
temp.next=temp.next.next;
return head;
}
}
