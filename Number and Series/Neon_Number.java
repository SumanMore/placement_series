
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
//A number is said to be NEON if the sum of digitsof square of the number is equal to the number itself. input =9→ 9*9=81 ;8+1=9

import java.util.*;
public class Neon_Number {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
    int s=0,sq;
sq=num*num; 
while(sq>0)
{
int r=sq%10;
s=s+r;
sq=sq/10; 
}
if(s==num)
System.out.println("Neon number");
else
System.out.println("Not a Neon number");
}}

