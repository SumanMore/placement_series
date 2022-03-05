boolean isPalindrome(Node head) 
    {
        //Your code here
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=slow;
        Node n=null;
        Node finalist=null;
        while(temp!=null)
        {
            n=temp.next;
            temp.next=finalist;
            finalist=temp;
            temp=n;
        }
        fast=head;
        while(finalist!=null)
        {
            if(fast.data!=finalist.data)
            {
                return false;
            }
            fast=fast.next;
            finalist=finalist.next;
        }
        return true;
        
    }    
