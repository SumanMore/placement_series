class Solution{
    public void toSumTree(Node root){
         //add code here.
         solve (root);
    }
    int solve(Node root)
    {
        if(root==null)
        {
        return 0;
        }
        int l=solve(root.left);
        int r=solve(root.right);
        int x=root.data;
        root.data=l+r;
        return l+r+x;
    }
}
