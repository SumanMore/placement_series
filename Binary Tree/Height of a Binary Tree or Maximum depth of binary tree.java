class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        int h;
        if(node==null)
        {
            return 0;
        }
        int leftdepth=height(node.left);
        int rightdepth=height(node.right);
        if(leftdepth>rightdepth)
        {
            h=1+leftdepth;
        }
        else
        {
            h=1+rightdepth;
        }
        return h;
    }
}
