class GfG
{
    public static int sumOfLeafNodes(Node root)
    {
        // code here 
         if (root == null)
        {
            return 0;
        }
        
        if (root.left == null && root.right == null)
        {
            return root.data;
        }
        int lh = sumOfLeafNodes(root.left);
        int rh = sumOfLeafNodes(root.right);
        
        return lh + rh;
    }
}
