static void postorder(node root)
{
    if (root == null)
        return;
  postorder(root.left);
  postorder(root.right);
  System.out.print(root.val);
}
