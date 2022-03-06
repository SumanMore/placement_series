import java.util.*;

class Main {
  public static void main(String[] args) {
    List<Integer> ob=new ArrayList<Integer>();
    Collections.addAll(ob,6,5,4,3,2,3,2,1,0);
    nextPermutation(ob);
}
public static void nextPermutation( List<Integer> perm)
{
  int k=perm.size()-2;
  while(perm.get(k)>perm.get(k+1))
  {
   k=k-1;
  }
  for(int i=perm.size()-1;i>k;i--)
  {
    if(perm.get(i)>perm.get(k))
    {
      Collections.swap(perm,i,k);
      break;
    }

  }
  Collections.sort(perm.subList(k+1, perm.size()));
  System.out.println(perm);
  
}}
