/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
// A number will be called DISARIUM if sum of its digits powered with their respective position is equal to the original number.

import java.util.*;
public class Disarium_number {
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int c=0,d,s=0;// counter , s is to store sum & d is duplicate
d=num;
while(d>0) // to count no of digits
{
c++; // counting No. of digits
d=d/10; // to remove last digit of the input number
}
d=num;
while(d>0) // to find sum of digits with their respective power
{
int r=d%10; // to last digit
s=s+(int)Math.pow(r,c); // here c is power of the digit according its position
d=d/10;
c--; // to get power of next digit
}
if(s== num)
System.out.println("DISARIUM NUMBER ");
else
System.out.println("NOT A DISARIUM NUMBER");
}}

