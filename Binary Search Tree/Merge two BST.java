class Solution
{
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    public List<Integer> merge(Node root1,Node root2)
    {
        // Write your code here
        ArrayList<Integer> ob=new ArrayList<Integer>();
		ArrayList<Integer> ob1=new ArrayList<Integer>();
			inorder(root1,ob);
			inorder(root2,ob1);
			ob.addAll(ob1);
			Collections.sort(ob);
			return ob;
	}
 static void inorder(Node root , ArrayList<Integer> ob)
  {
      if(root==null)
        return ;
      inorder(root.left,ob);
      ob.add(root.data);
      inorder(root.right,ob);
  }
