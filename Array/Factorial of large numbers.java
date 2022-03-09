static BigInteger factorial(int N)
    {
        // Initialize result
        BigInteger f
            = new BigInteger("1"); // Or BigInteger.ONE
 
        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));
 
        return f;
    }

or
class Solution {
    static ArrayList<Integer> factorial(int N){
       
         ArrayList<Integer> arrayList = new ArrayList<>();

       java.math.BigInteger num = new java.math.BigInteger("1");

       for (int i = 2; i <= N; i++) {
           num = num.multiply(java.math.BigInteger.valueOf(i));
       }

       char[] charArray = num.toString().toCharArray();

       for (char c : charArray) {
           int i = Integer.parseInt(String.valueOf(c));
           arrayList.add(i);
       }

       return arrayList;
 
    }
}
