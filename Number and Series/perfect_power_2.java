//write a program to test if x is a power of 2

class Main {
  public static void main(String[] args) {
    for(int i=1;i<=10;i++)
    {
      int y=i &(i-1);
      boolean res=(y==0) ? true:false;
      System.out.println(i+" "+res);
    }
  }
}
