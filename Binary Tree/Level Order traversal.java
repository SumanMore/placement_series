
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> ob=new ArrayList<Integer>();
        if(node==null)
        {
            return ob;
        }
        Queue<Node> ob1=new LinkedList<Node>();
       ob1.add(node);
       while(!ob1.isEmpty())
       {
             Node tempNode = ob1.poll();
             ob.add(tempNode.data);
            if (tempNode.left != null) {
                ob1.add(tempNode.left);
            }
 
           
            if (tempNode.right != null) {
                ob1.add(tempNode.right);
            }
       }
       return ob;
    }
}
