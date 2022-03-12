class Tree
{
   
    public static float findMedian(Node root)
    {
        // code here.
        ArrayList<Integer> list=new ArrayList<Integer>();
        inorder(root,list);
          int len=list.size();
       int k=len/2;
        float median=0;
       if(len%2!=0){
         median=list.get(k);
       }
       else{
           median=(float)((list.get(k)+list.get(k-1))*1.0/2);
       }
       return median;
    }
    static void inorder(Node root , ArrayList<Integer> list)
     {
      if(root==null)
          return ;
      inorder(root.left,list);
      list.add(root.data);
      inorder(root.right,list);
    }
}
