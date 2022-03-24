class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here
	    ArrayList<Integer> ob=new ArrayList<Integer>();
	    Queue<Node> q=new LinkedList<Node>();
	    int f=1;
	    if(root==null)
	    {
	        return ob;
	    }
	    q.add(root);
	    while(!q.isEmpty())
	    {
	         ArrayList<Integer> temp=new ArrayList<Integer>();
	         int size=q.size();
	         while(size!=0)
	         {
	             Node t=q.poll();
	             temp.add(t.data);
	             if(t.left!=null)
	             {
	                 q.add(t.left);
	             }
	             if(t.right!=null)
	             {
	                 q.add(t.right);
	             }
	             size--;
	         }
	    
	    if(f%2==0)
	     
	     {
	         Collections.reverse(temp);
	     }
	     for(int i=0;i<temp.size();i++)
	     {
	         ob.add(temp.get(i));
	     }
	     f=f==0?1:0;
	     
	}
	return ob;
	}
}
