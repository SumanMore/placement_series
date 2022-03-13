class Tree
{
    
	public static int getSize(Node root)
	{
//add Code here.
       if(root==null)
        {
          return 0;
            
        }
       int  c=1+getSize(root.left)+getSize(root.right);
        return c;
        
       

    }
}
