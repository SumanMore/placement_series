void mirror(Node root)
{
  if(root)
  {
    mirror(root.left);
    mirror(root.right);
    Node temp=root.left;
    root.left=root.right;
    root.right=temp;
  }
  return ;
}
