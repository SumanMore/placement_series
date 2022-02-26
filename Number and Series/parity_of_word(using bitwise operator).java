class Main 
{
public static long parity1(long x)
{
int r = 0;
while (x != 0) 
 {
  r ^= (x & 1);
  x = x>>1;
}
return r;
}

public static long parity2(long x)
  {
int r1 = 0;
while (x != 0) 
 {
r1 ^= 1;
x = x&(x-1);
}
return r1;
  }
 
 
  public static long parity3(long x)
  {
 int  wordsize =2;
int mask = 0b11 ;
long res= parity2((x >> (3 * wordsize) & mask))^parity2((x >> (2 * wordsize )& mask))^parity2((x >> (1 * wordsize) & mask)) ^ parity2((x >> (0 * wordsize )& mask));
return res;
}
public static long parity4(long x)
  {
    x=(x>>4)^(x&1111);
    x=(x>>2)^(x&11);
    x=(x>>1)^(x&1);
    return(x&1);
  }

  public static void main(String[] args) {
    long x=0b11010110;
    System.out.println(parity1(x));
    System.out.println(parity2(x));
System.out.println(parity3(x));
System.out.println(parity4(x));
  }
}
