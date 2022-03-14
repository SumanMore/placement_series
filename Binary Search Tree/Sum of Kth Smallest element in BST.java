class Tree {
    int sum(Node root, int k) { 
        ArrayList<Integer> ob=new ArrayList<Integer>();
        inorder(root,ob);
       int l=0;
       int sum=0;
       while(k!=0)
       {
          sum=sum+ob.get(l);
          l++;
          k--;
       }
       return sum;
        
        // Code here
    } 
    static void inorder(Node root, ArrayList<Integer> ob)
    {
        if(root==null)
        return ;
        inorder(root.left,ob);
        ob.add(root.data);
        inorder(root.right,ob);
    }
}
