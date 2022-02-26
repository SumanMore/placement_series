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
public class Pallindrome_no {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int r,rev=0,d;
       d=n;
       while(d>0)
       {
           r=d%10;
           rev=rev*10+r;
           d=d/10;
           
       }
       if(rev==n)
       System.out.println("Pallindrome  No");
       else
           System.out.println(" Not a Pallindrome  No");
           
}}
