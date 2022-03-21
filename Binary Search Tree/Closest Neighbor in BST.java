class Tree
{
    public static int findMaxForN(Node node, int val)
    {
    //Add your code here.
    int res=0;
    if(node==null)
    {
        return -1;
    }
    ArrayList<Integer> ob=new ArrayList<Integer>();
    inorder(node,ob);
    
    for(int i=0;i<ob.size()-1;i++)
    {
        if(ob.get(i)<=val && ob.get(i+1)>val)
        {
            res= ob.get(i);
        }
         if(ob.get(ob.size()-1)==val)
        {
            res=ob.get(ob.size()-1);
           
        }
       
    }
    return res;
    }
    static void inorder(Node root, ArrayList<Integer> ob)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left,ob);
        ob.add(root.key);
        inorder(root.right,ob);
    }
}
