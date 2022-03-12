class Solution
{
	public static int countPairs(Node root1, Node root2, int x)
	{
		// Code here
		int c=0;
		HashSet<Integer> ob=new HashSet<Integer>();
		HashSet<Integer> ob1=new HashSet<Integer>();
			inorder(root1,ob);
			inorder(root2,ob1);
			for(int i:ob)
			{
			   
			   if(ob1.contains(x-i))
			   {
			       c++;
			   }
			   
			}
			return c;
	}
 static void inorder(Node root , HashSet<Integer> ob)
  {
      if(root==null)
        return ;
      inorder(root.left,ob);
      ob.add(root.data);
      inorder(root.right,ob);
  }
}
