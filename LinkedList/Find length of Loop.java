class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
               return countNodes(slow);
        }
        return 0;
       
    }
    static int countNodes( Node n)
{
int res = 1;
Node temp = n;
while (temp.next != n)
{
    res++;
    temp = temp.next;
}
return res;
}
}
