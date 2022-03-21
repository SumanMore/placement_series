class Tree {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        if (root == null) 
             return -1;
        // Code here
        int res=0;
        ArrayList<Integer> ob=new ArrayList<Integer>();
        inorder(root,ob);
        for(int i=0;i<ob.size();i++)
        {
            if(ob.get(i)==key)
            {
               res= key;
               break;
            }
            else
            {
               if(ob.get(i)>key)
               {
                   res=ob.get(i);
                   break;
               }
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
        ob.add(root.data);
        inorder(root.right,ob);
    }
}
