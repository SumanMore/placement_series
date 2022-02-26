
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
public class Niven_Number {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int d=sc.nextInt();
       int r,sum=0,n;
       n=d;
       while(n>0)
       {
           r=n%10;
           sum=sum+r;
           n=n/10;
           
       }
       if(d%sum==0)
       System.out.println("Niven  No");
       else
           System.out.println(" Not a Niven No");
}
}