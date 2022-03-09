class Solution
{
	boolean isSumTree(Node root)
	{
             if(root==null)
             {
                 return true;
             }
             if(root.left==null && root.right==null)
             {
                 return true;
             }
             int leftsum=add(root.left);
             int rightsum=add(root.right);
             int total=leftsum+rightsum;
             if(total==root.data)
             {
                 if(isSumTree(root.left)&& isSumTree(root.right))
                 {
                     return true;
                 }
             }
             return false;
	}
	int add(Node root)
	{
	    if(root==null)
	    {
	        return 0;
	    }
	    int sum=root.data+add(root.left)+add(root.right);
	    return sum;
	}
}
