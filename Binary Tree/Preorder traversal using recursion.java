static void preorder(node root)
{
    if (root == null)
        return;
    System.out.print(root.val);
    preorder(root.left);
    preorder(root.right);
}
