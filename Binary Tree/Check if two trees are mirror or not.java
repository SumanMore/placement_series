class Solution {
    boolean areMirror(Node a, Node b) {
        // Your code here
        if(a==null || b==null)
        {
            return a==b;
        }
         if(a.data != b.data)
           return false ;
        return areMirror(a.left , b.right) &&  areMirror(a.right,b.left) ;
       
    }
}
or

class Solution {
    boolean areMirror(Node a, Node b) {
        // Your code here
       if (a == null && b == null) 
       {
              return true ;
        } else if (a != null && b != null) 
        {
return a . data == b . data&&  areMirror(a.left , b.right) &&  areMirror(a.right,b.left) ;
}

return false;
       
    }
}
