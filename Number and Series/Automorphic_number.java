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
public class Automorphic_number {
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c=0,d,r,l,s;
      s=n*n;
      d=n;
      while(d>0)
      {
          c++;
          d=d/10;
                  
      }
     l=s%(int)(Math.pow(10,c));
     if(l==n)
     
         System.out.println("Automorphic Number");
         
     
     else 
         System.out.println(" Not an Automorphic Number");
          
  }
}
