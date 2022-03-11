class Solution{
    public static int findMax(Node root){
        //code here
        if(root==null)
        {
            return -1;
        }
        else if(root.right==null)
        {
            return root.data;
        }
        return findMax(root.right);
    }
    public static int findMin(Node root){
       
        if(root==null)
        {
            return -1;
        }
        else if(root.left==null)
        {
            return root.data;
        }
        return findMin(root.left);
    }
}
