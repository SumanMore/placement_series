class Solution
{
    //Function to find the nodes that are common in both BST.
	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
    ArrayList<Integer> ob=new ArrayList<Integer>();
    ArrayList<Integer> ob1=new ArrayList<Integer>();
    ArrayList<Integer> ob2=new ArrayList<Integer>();
        inorder(root1,ob);
         inorder(root2,ob1);
          int i = 0, j = 0;
        while (i < ob.size() && j < ob1.size()) {
            if (ob.get(i)<ob1.get(j))
                i++;
            else if (ob1.get(j)< ob.get(i))
                j++;
            else {
               ob2.add(ob1.get(j));
                j++;
                i++;
            }
        }
        return ob2;
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
