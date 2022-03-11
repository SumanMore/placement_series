Without recursion.
  class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) 
    {
        if(node==null)
        {
            return -1;
        }
        Node temp=node;
        while(temp.left!=null)
        {
            temp=temp.left;
        }
        return temp.data;
        
    }
}


With recursion
class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) 
    {
        if(node==null)
        {
            return -1;
        }
        else if(node.left==null)
        {
            return node.data;
        }
        return minValue(node.left);
        
    }
}
