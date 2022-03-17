class Solution
{
    // root : the root Node of the given BST
    // target : the target sum
    public int isPairPresent(Node root, int target)
    {
    ArrayList<Integer> ob=new ArrayList<Integer>();
    HashSet<Integer> ob1=new HashSet<Integer>();
         inorder(root,ob);
        
        for(int i=0;i<ob.size();i++)
        {
            int curr=target-ob.get(i);
            if(ob1.contains(curr))
            {
                return 1;
            }
           ob1.add(ob.get(i));
        }
        return 0;
         
        
    }
  static void inorder(Node root , ArrayList<Integer> ob)
  {
      if(root==null)
        return ;
      inorder(root.left,ob);
      ob.add(root.data);
      inorder(root.right,ob);
        
    }
}
