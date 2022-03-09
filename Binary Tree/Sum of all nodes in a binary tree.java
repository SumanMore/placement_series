class BinaryTree
{
    static int sumBT(Node head){
        //Code
        if(head==null)
        {
            return 0;
            
        }
        int sum=head.data+sumBT(head.left)+sumBT(head.right);
        return sum;
    }
}
