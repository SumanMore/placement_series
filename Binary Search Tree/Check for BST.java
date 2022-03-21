public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
  ArrayList<Integer> list = new ArrayList<Integer>();
   boolean isBST(Node root)
   {
       
       inorder(root);
       
       for(int i=0;i<list.size()-1;i++)
       {
        if(list.get(i)>=list.get(i+1)) return false;  
       }
       return true;
   }
   
   
    public  void inorder(Node root)  {
       if(root != null) 
       {
           inorder(root.left);
           list.add(root.data);
           inorder(root.right);
       }
    }
}
