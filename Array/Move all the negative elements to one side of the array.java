ArrayList<Integer> res=new ArrayList<Integer>();
       for(int i:arr)
       {
           if(i>=0)
           {
               res.add(i);
           }
       }
       for(int i:arr)
       {
           if(i<0)
           {
               res.add(i);
           }
       }
       for(int i=0;i<n;i++)
       {
           arr[i]=res.get(i); 
       }
