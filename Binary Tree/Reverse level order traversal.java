class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> ob=new ArrayList<Integer>();
        if (node == null)
		  return ob;

		Queue<Node> ob1 = new LinkedList<Node>();
		ob1.add(node);

		while(!ob1.isEmpty())
		{
			Node currNode = ob1.poll();
			ob.add(currNode.data);
           if(currNode.right != null) 
			   ob1.add(currNode.right);
			if(currNode.left  != null)
			    ob1.add(currNode.left);
			
		}
		Collections.reverse(ob);
		return ob;
    }
}      
