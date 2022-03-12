class Solution {
    // Return the Kth smallest element in the given BST
    ArrayList<Integer> ob=new ArrayList<Integer>();
    public int KthSmallestElement(Node root, int K) {
        // Write your code here
        
         
         inorder(root,ob);
         if(ob.size()<K)
           return -1;
         return ob.get(K-1);
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
