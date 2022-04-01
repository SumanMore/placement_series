class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
          BigInteger b1=new BigInteger(s1);
        BigInteger b2=new BigInteger(s2);
        
        BigInteger b3=b1.multiply(b2);
        
        return b3.toString();
    }
}
