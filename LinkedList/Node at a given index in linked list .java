class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
       int c=0,res=0;
      while(node!=null)
      {
          c++;
          if(c==ind)
          {
              res=node.data;
          }
          node=node.next;
          
          
          
      }
      return res;
    }
}
