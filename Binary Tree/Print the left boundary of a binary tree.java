void left_BDR(Node p)
{
  if(p!=null)
  {
    if(p.left!-null)
    {
      System.out.println(p.data);
      left_BDR(p.left);
    }
    else if(p.right!=null)
    {
      System.out.println(p.data);
      left_BDR(p.right);
    }
  }
