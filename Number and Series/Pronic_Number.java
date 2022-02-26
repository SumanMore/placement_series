/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
// (Pronic number is the number which is the product of two consecutive integers)
//Examples: 12 = 3 × 4 
 import java.util.*;
public class Pronic_Number {
     public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
    int f=0,d;
 for(d=0;d<n;d++)
 {
 if(d*(d+1)==n)
 {
 f=1;
 break;
 }
 }
 if(f==1)
 System.out.println("Pronic");
 else
 System.out.println("Not a Pronic");
}}
