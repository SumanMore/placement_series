class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
           //add your code here.
           ArrayList<Integer> ob=new ArrayList<Integer>();
           Queue<Node> q=new LinkedList<>();
           if(root==null)
              return ob;
           q.add(root);
           while(!q.isEmpty())
           {
               Node temp=q.poll();
               q.pop();
               if(temp!=null)
               {
                   if(temp.left!=null)
                   {
                       q.add(temp);
                   }
                   ob.add(temp.data);
                   temp=temp.right;
               }
           }
           return ob;
      }
}
