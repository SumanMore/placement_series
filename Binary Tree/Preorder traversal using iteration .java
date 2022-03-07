class Tree
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root)
    {
        // Code
        Node p=root;
        ArrayList<Integer> ob=new ArrayList<Integer>();
        Stack<Node> ob1=new Stack<Node>();
        while(true)
        {
            while(p!=null)
            {
                ob.add(p.data);
                ob1.push(p);
                p=p.left;
            }
            if(ob1.isEmpty())
            {
                break;
            }
            p=ob1.pop();
            
            p=p.right;
        }
    return ob;
    }
    
    
}
