class Solution
{
    ArrayList<Node> v=new ArrayList<Node>();
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public Node inorderSuccessor(Node root,Node x)
      {
        
          inorder(root);
       for(int i=0;i<v.size();i++)
       {
           if(v.get(i)==x && i<v.size()-1)
           {
               return v.get(i+1);
           }
       }
      return null;
     }
        void inorder(Node root)
        {
        if(root==null)
        {
            return ;
        }
        inorder(root.left);
        v.add(root);
        inorder(root.right);
        return ;
    }
}
