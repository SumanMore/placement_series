import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]={5,10,2,11,222,1};
	    int n=6;
	    int k=2;
	    Arrays.sort(arr);
	    System.out.println(arr[k-1]);
	    System.out.println(arr[n-k]);
	}
}
