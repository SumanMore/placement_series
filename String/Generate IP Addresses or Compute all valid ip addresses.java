import java.util.*;
class Main {
  public static void main(String[] args)
   {
    getValidIpAddress("19216811");
   }

public static void getValidIpAddress(String s)
 {
   List<String> ob = new ArrayList<String>();
  for (int i = 1; i < 4 && i < s.length(); ++i)
   {
   String first = s.substring (0 , i);
   if (isValid(first)) 
   {
    for (int j = 1;  j <4 &&i + j < s.length() ; ++ j) 
    {
     String second = s.substring (i , i + j);
     if ( isValid(second) )
     {
     for (int k = 1; k<4 &&i + j + k< s.length(); ++k) 
     {
       String third = s.substring (i + j, i + j + k) ;
       String fourth = s.substring (i + j + k) ;
       if ( isValid(third) && isValid(fourth))
        {
       ob.add(first + "."+ second +"." + third + "."+ fourth);
        }
     }
    }
   }
   }
  }
System.out.println(ob);
}
private static boolean isValid(String s) 
{
if (s.length() > 3) 
    return false;
if (s.startsWith("0") && s.length() > 1) 
    return false;

int val = Integer.parseInt(s) ;
return val <= 255 && val >= 0;

}}
