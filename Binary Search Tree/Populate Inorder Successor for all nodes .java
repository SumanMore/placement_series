class Solution{
    public void populateNext(Node root){
        //code here
        ArrayList<Node> ob=new ArrayList<Node>();
        inorder(root,ob);
        result(root,ob);
    }
    void inorder(Node root,ArrayList<Node> ob)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left,ob);
        ob.add(root);
        inorder(root.right,ob);
    }
    void result(Node root,ArrayList<Node> v)
    {
    for(int i=0;i<v.size()-1;i++)
    {
        v.get(i).next=v.get(i+1);
    }
    
    }
}
