class Tree
{
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
        //Your code here
        ArrayList<Integer> ob=new ArrayList<Integer>();
        inorder(root,ob);
        int c=0;
        for(int i=0;i<ob.size();i++)
        {
            if(ob.get(i)>=l && ob.get(i)<=h)
            {
                c++;
            }
        }
        return c;
        
        
    }
    void inorder(Node root , ArrayList<Integer> ob)
  {
      if(root==null)
        return ;
      inorder(root.left,ob);
      ob.add(root.data);
      inorder(root.right,ob);
  }
}
