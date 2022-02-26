
import java.util.Scanner;

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
public class Armstrong_no{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int d=sc.nextInt();
       int r,sum=0;
       int n=d;
       while(n>0)
       {
           r=n%10;
           sum=sum+(r*r*r);
           n=n/10;
           
       }
       if(sum==d)
       System.out.println("Armstrong  No");
       else
           System.out.println(" Not a Armstrong  No");
           
}}
   

