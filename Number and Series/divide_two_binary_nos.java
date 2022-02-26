class Main {
  public static void main(String[] args) {
    long x=0b1011, y=0b10;
    System.out.println(Long.toBinaryString(division(x,y)));
  }

  public static long division(long x, long y){
    long y2k, quotient=0, k=5;
    y2k=(y<<k);
    while(x>=y)
    {
  
      while(y2k > x)
      {
        y2k = y2k >> 1;
        k = k-1;
      }
      quotient+= (1<<k);
      x=x-y2k;
    }
    return quotient;
  }
}
