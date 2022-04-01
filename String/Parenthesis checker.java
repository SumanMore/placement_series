1)Scan from left to right.
2) if you found opening symbol, then add it to the list.
3) if you found closing symbol, then remove the last opening symbol in the list.
4) should end with a empty list.
  
  
  class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String exp)
    {
       
	Stack<Character> stack = new Stack<Character>();
for (int i = 0; i < exp.length(); i++)
{
if (exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '[') 
{
stack.push(exp.charAt(i));
}

if (exp.charAt(i) == ')' || exp.charAt(i) == '}' || exp.charAt(i) == ']')
{
if (stack.empty()) 
 {
    
   return false;
     
 }

char top = stack.pop();

if ((top == '(' && exp.charAt(i) != ')') ||(top == '{' && exp.charAt(i) != '}') ||(top == '[' && exp.charAt(i) != ']'))
{
return false;
}
}
}
return stack.empty();
}}

  
