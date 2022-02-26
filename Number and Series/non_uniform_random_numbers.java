import java.util.*;
class Main {
  public static void main(String[] args) {
    List<Integer> ob=new ArrayList<Integer>();
    Collections.addAll(ob,3,5,7,11);
     List<Double> pr=new ArrayList<>();
    Collections.addAll(pr , 0.5,0.333,0.944,1.0);
   System.out.println(nonuniformrandom(ob,pr));
  }
public static int  nonuniformrandom(List<Integer> value,List<Double> pr) 
{
List<Double> sum_pr = new ArrayList<>() ;
sum_pr.add(0.0);
for (double p : pr) {
sum_pr.add(sum_pr.get (sum_pr.size() - 1)+ p) ;
}
Random r = new Random () ;
 final double n = r .nextDouble() ;
int it = Collections .binarySearch(sum_pr,n);
if (it < 0) 
{
  final int idx= (Math.abs(it) - 1) - 1;
return(value.get (idx)) ;
} 
else {
return value.get(it);
}
}}


/*import java.util.*;
class Main {
  public static void main(String[] args) {
    ArrayList<Integer> N=new ArrayList<Integer>();
		N.add(3);
		N.add(5);
		N.add(7);
		N.add(11);
		ArrayList<Double> P=new ArrayList<Double>();
		P.add(9.0/18);
		P.add(6.0/18);
		P.add(2.0/18);
		P.add(1.0/18);
		System.out.println("Non-Uniform Random Number Generated: "+Q1.generateNonuniform(N,P));
  }
}
import java.util.*;
//WAP to generate non uniform random number
class Q1{
  public static int generateNonuniform(ArrayList<Integer> N,ArrayList<Double> P){
		for(int i=1;i<P.size();i++)
			P.set(i,P.get(i-1)+P.get(i));
		double r=Math.random();
		for(int i=0;i<P.size();i++){
			if(i==0){
				if(r<P.get(i))
					return(N.get(i));
			}
			else{
				if((r>=P.get(i-1)) && (r<P.get(i)))
					return(N.get(i));
			}
		}
		return(-1);
	}
}*/
