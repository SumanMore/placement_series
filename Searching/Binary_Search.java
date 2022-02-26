
import java.util.*;
public class Binary_Search {
   public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the total no of elements");
       int n=sc.nextInt();
       int ar[]=new int[20];
       
       int i,j,mid,flag=-1;
       System.out.println("enter elements");
       for(i=0;i<n;i++)
       {  
           ar[i]=sc.nextInt();
       }
       System.out.println("enter the element to be searched");
       int ele=sc.nextInt(); 
int beg=0;
 int end = n-1;
 while(beg<=end)
 {
     mid=(beg+end)/2;
     if(ar[mid]==ele)
     {
         flag=mid;
                
         break;
     } 
     else if(ar[mid]>ele)
         end=mid-1;
     else
         beg=mid+1;}
     if (flag!=-1)
           System.out.println("Element found  at index" +flag);
         else      
         System.out.println("Element not found");   
 }}
