class Solution {
    void rearrange(int arr[], int n) {
      ArrayList<Integer> positive = new ArrayList<>();
       ArrayList<Integer> negative = new ArrayList<>();
       int index=0;
       
       for(int i=0;i<n;i++)
       {
           if(arr[i]>=0)
           {
               positive.add(arr[i]);
           }
           else
           {
              negative.add(arr[i]);
           }
       }
       for(int i=0;i<positive.size()||i<negative.size();i++)
       {
            if(i<positive.size())
           arr[index++]=positive.get(i);
           if(i<negative.size())
           arr[index++]=negative.get(i);
       }
       

        
    }
}
