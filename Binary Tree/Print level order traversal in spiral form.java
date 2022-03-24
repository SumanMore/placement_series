class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    { 
        ArrayList<Integer> ob=new ArrayList<Integer> ();
        // Your code here
        if(root==null)
        {
            return ob;
        }
       
   
        Stack<Node> s1 = new Stack<Node>();
      
        Stack<Node> s2 = new Stack<Node>();
 
       
        s1.push(root);
 
        while (!s1.empty() || !s2.empty()) {
            
            while (!s1.empty()) 
            {
                Node temp = s1.peek();
                s1.pop();
                ob.add(temp.data);
 
                // Note that is right is pushed before left
                if (temp.right != null)
                    s2.push(temp.right);
 
                if (temp.left != null)
                    s2.push(temp.left);
            }
 
            
            while (!s2.empty()) {
                Node temp = s2.peek();
                s2.pop();
                   ob.add(temp.data);
                if (temp.left != null)
                    s1.push(temp.left);
                if (temp.right != null)
                    s1.push(temp.right);
            }
      
        }
         return ob;
    }
}
