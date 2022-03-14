class GfG
{
    int compare(Node node1, Node node2)
    {
      //Your code here
      Node temp1=node1;
      Node temp2=node2;
      while(temp1!=null && temp2!=null)
      {
         if(temp1.data > temp2.data)
            return 1;
        else if(temp2.data > temp1.data)
            return -1;
          temp1 = temp1.next;
          temp2 = temp2.next;
      }
      return 0;
    }
}
