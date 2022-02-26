import java.util.*;
class Main {
  public static void main(String[] args) {
     List<Integer> primes=new ArrayList<Integer>();
		for(int i=2;i<=15;i++) {
			if(prog.checkprime(i)) {
				primes.add(i);
			}
		}
		System.out.println("Approach 1 "+primes);
    System.out.println("Approach 2 "+prog1.generatePrimes(15));
    System.out.println("Approach 3 "+prog2.generatePrimes(15));
  }
}


import java.util.*;
class prog{
  public static boolean checkprime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}

import java.util.*;
class prog1{
  public static List<Integer> generatePrimes(int n) {
    List<Integer> primes = new ArrayList <>();
    List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n + 1, true));
    isPrime.set(0 , false);
    isPrime.set(1 , false);
    for (int p = 2; p <= n; ++p) {
      if (isPrime.get(p)){
        primes.add(p);
        for (int j = p; j <= n; j += p) {
          isPrime.set(j, false);
        } 
      }
 }
return primes;
  }
}


import java.util.*;
class prog2{
  public static List<Integer> generatePrimes(int n){
   final int size=(int)Math.floor(0.5*(n-3))+1;
		List<Integer> primes=new ArrayList<>();
		primes.add(2);
		List<Boolean> isPrime=new ArrayList<>(Collections.nCopies(size,true));
		for (int i=0;i<size;++i) {
			if(isPrime.get(i)){
				int p=((i*2)+3);
				primes.add(p);
				for (long j=((i*i)*2)+i+3;j<size;j+=p){
					isPrime.set((int)j, false);
					}
			}
		}
		return primes;
  }
}
