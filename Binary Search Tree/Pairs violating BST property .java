  public int pairs(Node root){
        //Write your code here
        ArrayList<Integer> ob=new ArrayList<Integer>();
        inorder(root,ob);
        int c=0;
         
          for(int i = 0; i<ob.size(); i++)
          {
              for(int j=0;j<i; j++)
              {
                  if(ob.get(j)> ob.get(i) ) 
                      c++;
              }
          }
          return c;
        
        
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
