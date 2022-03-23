class Tree
{
   
    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<Integer> noSibling(Node node)
    {
       checkList(node);
       Collections.sort(arr);
       if(arr.size()==0){
           arr.add(-1);
       }
       return arr;
        
    }
    void checkList(Node node){
         if(node == null){
            return;
        }
        if(node.left!= null && node.right == null){
            arr.add(node.left.data);
        }else if(node.left == null && node.right!= null){
            arr.add(node.right.data);
        }
        checkList(node.left);
        checkList(node.right);
        
    }
}
