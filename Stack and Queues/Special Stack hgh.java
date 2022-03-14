class GfG{
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
           
	return s.pop();
        }
	public int min(Stack<Integer> s)
        {
           //add code here.
           int min=s.get(0);
           for(int i=1;i<s.size();i++)
           {
               if(s.get(i)<min)
               {
                   min=s.get(i);
               }
           }
           return min;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
          if(s.size()==n)
          {
              return true;
          }
          return false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           if(s.size()==-1||s.size()==0)
           {
               return true;
           }
           return false;
	}
}
