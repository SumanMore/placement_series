/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */

    import java.util.*;
public class Perfect_number {
      public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int c=0,i;
       for(i=1;i<n;i++)
       {
           if(n%i==0)
               c=c+i;
       }
       if(c==n)
           System.out.println("perfect no");
       else
           System.out.println(" not perfect no");
           
}}
    

