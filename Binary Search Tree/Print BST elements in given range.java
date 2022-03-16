class Solution
{   
    //Function to return a list of BST elements in a given range.
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
        // code here.
       
        ArrayList<Integer> ob=new  ArrayList<Integer>();
         ArrayList<Integer> ob1=new  ArrayList<Integer>();
    inorder(root,ob);
          if (root ==null)
        {
            return ob1; 
        }
        
         for(int i=0;i<ob.size();i++)
         {
             if(ob.get(i)>=low && ob.get(i)<=high)
             {
                 ob1.add(ob.get(i));
             }
         }
         return ob1;
         
         
        
    }
    static void inorder(Node root, ArrayList<Integer> ob)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left,ob);
        ob.add(root.data);
        inorder(root.right,ob);
    }
    
}
