
import java.util.*;
public class Linear_Search {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the total no of elements");
       int n=sc.nextInt();
       int ar[]=new int[20];
       
       int i,j,flag=-1;
       System.out.println("enter elements");
       for(i=0;i<n;i++)
       {  
           ar[i]=sc.nextInt();
       }
       System.out.println("enter the element to be searched");
       int ele=sc.nextInt();
       for(j=0;j<n;j++)
       {
           if(ar[j]==ele)
           {
            flag=j;
            break;
           }
       }
       if (flag!=-1)
           System.out.println("Element found at index "+flag);
         else      
         System.out.println("Element not found");   
    }
}
