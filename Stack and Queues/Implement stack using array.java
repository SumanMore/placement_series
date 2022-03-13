class MyStack
{
    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	    if(top!=1000)
	    {
	    arr[++top]=a;
	   
	    }
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
        // Your code here
        int ele;
        if(top==-1)
        {
           return -1; 
        }
        else
        {
            ele=arr[top];
            top--;
        }
        return ele;
	}
}
