import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int ar[]=new int[n];
		    for(int j=0;j<n;j++)
		    {
		        ar[j]=sc.nextInt();
		    }
		    Arrays.sort(ar);
		    for(int p=0;p<n;p++)
		    {
		        System.out.print(ar[p]+" ");
		    }
		    System.out.println();
		}
	}
}
