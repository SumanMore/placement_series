class GFG
{
    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
   return deadEnd(root,1,Integer.MAX_VALUE);}
     static public boolean deadEnd(Node root,Integer min,Integer max){
   if (root==null)
       return false;
   if (min == max)
       return true;
   return deadEnd(root.left, min, root.data - 1)||deadEnd(root.right, root.data + 1, max);
    }
}
