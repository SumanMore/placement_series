void printleaf(Node p)
{
  if(p!=null)
  {
    printleaf(p.left);
    if(p.left==null && p.right==null)
    {
      System.out.println(p.data);
    }
    printleaf(p.right);
  }
}
