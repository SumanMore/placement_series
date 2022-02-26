
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
//( A number is only said to be spy if sum of the digits and the product of the digits of the input number is same .(e.g. 1124 1*1*2*4= 8 1+1+2+4=8))
import java.util.*;
public class Spy_number {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int s=0,p=1,r;
       while(n>0)
       {
           r=n%10;
           s=s+r;
           p=p*r;
           n=n/10;
}
       if(s==p)
           System.out.println("Spy Number");
       else
            System.out.println(" Not a Spy Number");
    }} 
