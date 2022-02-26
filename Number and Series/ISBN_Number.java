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
public class ISBN_Number {
     public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      long n=sc.nextInt();
      long sum=0;
      int i;
      for(i=1;i<=10;i++)
      {
          sum=sum+i*(n%10);
      }
      if(sum%11==0)
System.out.println("Valid ISBN number");
else
System.out.println("Not a Valid ISBN number");
  }}
    

