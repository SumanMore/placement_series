void right_BDR(Node p)
{
  if(p!=null)
  {
    if(p.right!=null)
    {
      System.out.println(p.data);
      right_BDR(p.right);
    }
    else if(p.left!=null)
    {
      System.out.println(p.data);
      right_BDR(p.left);
    }
  }
