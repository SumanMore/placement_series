class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        first=reverse(first);
        second=reverse(second);
        Node temp;
        int s,c=0;
        Node res=null;
        Node curr=null;
        while(first!=null|| second !=null)
        {
            s=c+(first?first.data:0)+(second?second.data:0);
            c=s>=10?1:0;
            s=s%10;
            temp=new Node(s);
            if(res==null)
                res=temp;
            else
               curr.next=temp;
            curr=temp;
            if(first)
            {
                first=first.next;
            }
             if(second)
            {
                second=second.next;
            }}
            if(c>0)
            {
               temp=new Node(s);
               curr.next=temp;
               curr=temp;
            }
        res=reverse(res);
        return res;
        
        
    }
   static Node reverse(Node start)
    {
        Node n=null,finalist=null;
        Node temp=start;
        while(temp.next!=null)
        {
            n=temp.next;
            temp.next=finalist;
            finalist=temp;
            temp=n;
        }
        start=finalist;
        return start;
        
    }
}
