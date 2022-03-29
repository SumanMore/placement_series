class Sol
{
    public static int wordBreak(String s, ArrayList<String> wordList )
    {
          boolean[] T = new boolean[s.length() + 1];
        Set<String> set = new HashSet<>();
        for (String word : wordList) {
            set.add(word);
        }
        T[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(T[j] && set.contains(s.substring(j, i))) {
                    T[i] = true;
                    break;
                }
            }
        }
   if( T[s.length()]==true)
   {
       return 1;
   }
   return 0;
    }
}
