import java.util.*;

public class Main
{
    public  static void main(String args[])
    {
        int ar[]={1 ,2 ,4, 3, 6};
        int sum=10;
          int curr;
       
        for(int i=0;i<ar.length-2;i++)
        {
            HashSet<Integer> ob=new HashSet<Integer>();
            for(int j=i+1;j<ar.length;j++)
            {
               curr=sum-ar[i];
               if(ob.contains(curr- ar[j]))
               {
                   System.out.print(ar[i]+" "+ar[j]+" "+ (curr - ar[j]));
               }
               ob.add(ar[j]);
            }
        }
    }
}


/*
public class Main
{
    public  static void main(String args[])
    {
        int ar[]={1 ,2 ,4, 3, 6};
        int sum=10;
        for(int i=0;i<ar.length-2;i++)
        {
            for(int j=i+1;j<ar.length-1;j++)
            {
                for(int k=j+1;k<ar.length;k++)
                {
                    if(ar[i]+ar[j]+ar[k]==sum)
                    {
                        System.out.println(ar[i]+" "+ar[j]+" "+ar[k]);
                    }
                }
            }
        }
    }
}
*/
