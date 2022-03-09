int countLeaves(Node node) 
    {
         // Your code
        
         if(node==null) return 0;
         if(node.left==null&&node.right==null){
          return 1; }
         else{
             return countLeaves(node.left)+countLeaves(node.right);
         } 
    }
