/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
// 145 is a special number because sum of factorial of its digits is equal to the original number 1! + 4! + 5! = 145 ( 5!=5*4*3*2*1 , 4!= 4*3*2*1 , 1!= 1 )
import java.util.*;
public class Special_number {
    public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int p,r,d,i,sum=0;
      d=n;
      while(d>0)
              {
                  p=1;
                  r=d%10;
                  for(i=1;i<=r;i++)
                  {
                      p=p*i;
                     
                  } sum=sum+p;
              d=d/10;}
      if(sum==n)
          System.out.println("Special Number");
      else
          System.out.println(" Not a Special Number");
          
  }          
            
      
    
}
