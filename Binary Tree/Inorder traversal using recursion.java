static void inorder(node root)
{
    if (root == null)
        return;
    inorder(root.left);
    System.out.print(root.val);
    inorder(root.right);
}
