class Solve
{
    static int countTriplets(Node head, int x) 
    { 
        //code here.
         ArrayList<Integer> list = new ArrayList<>();
        while(head!= null){
            list.add(head.data);
            head = head.next;
    } 
     int curr,c=0;
     for(int i=0;i<list.size()-2;i++)
        {
            HashSet<Integer> ob=new HashSet<Integer>();
            for(int j=i+1;j<list.size();j++)
            {
               curr=x-list.get(i);
               if(ob.contains(curr- list.get(j)))
               {
                  c++;
               }
               ob.add(list.get(j));
   
}
}
return c;
}}
