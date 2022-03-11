class Solution
{
   
   ArrayList<Integer> ob=new ArrayList<Integer>(); // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
         inorder(root,ob);
         return ob.get((ob.size()-K));
    }
  void inorder(Node root , ArrayList<Integer> ob)
  {
      if(root==null)
        return ;
      inorder(root.left,ob);
      ob.add(root.data);
      inorder(root.right,ob);
  }
     
