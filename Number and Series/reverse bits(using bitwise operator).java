class Main {
	public static long swap(long x,int i,int j) {
		if(((x>>i)&1)!=((x>>j)&1)) {
			int mask=(1<<i)|(1<<j);
			x=x^mask;
	}
		return x;
  }
  public static long reverse(long x,int i,int j) {
		int mask=0b11;
		int wordsize=2;
		long result=
				swap((x>>(0*wordsize)&mask),i,j)<<(3*wordsize)|
				swap((x>>(1*wordsize)&mask),i,j)<<(2*wordsize)|
				swap((x>>(2*wordsize)&mask),i,j)<<(1*wordsize)|
				swap((x>>(3*wordsize)&mask),i,j)<<(0*wordsize);
		return result;
	}

	public static void main(String[] args) {
		long x=0b10010011;
		int i=1;
		int j=2;

		System.out.println(Long.toBinaryString(swap(x,i,j)));
    System.out.println(Long.toBinaryString(reverse(x,i,j)));
	}
	}
