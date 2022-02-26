/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class Fibonacci_Series {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the numbers of terms");
        int a =obj.nextInt();
        int x=0,y=1,sum=0,i;
        System.out.println(x);
        System.out.println(y);
        for (i=3;i<=a;i++)
        {
            sum=x+y;
            x=y;
            y=sum;
            System.out.println(sum);
        }
    }
}
