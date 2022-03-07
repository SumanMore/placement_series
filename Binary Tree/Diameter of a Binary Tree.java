 class Solution {
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
    if(root==null)
    {
        return 0;
    }
    int lheight=height(root.left);
    int rheight=height(root.right);
    int ldiameter=diameter(root.left);
    int rdiameter=diameter(root.right);
    int fd=Math.max(lheight+rheight+1,Math.max(ldiameter,rdiameter));
    return fd;
    }
    int height(Node root)
    {
        int h;
         if(root==null)
    {
        return 0;
    }
    int lheight=height(root.left);
    int rheight=height(root.right);
    if(lheight>rheight)
    {
        h=1+lheight;
    }
    else
    {
        h=1+rheight;
    }
    return h;
    }
}
