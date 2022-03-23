HashSet<Character> set=new HashSet<>();
        for(int i=0; i<patt.length(); i++)
        {
            set.add(patt.charAt(i));
        }
        for(int i=0; i<str.length(); i++)
        {
            if(set.contains(str.charAt(i)))
            return i;
        }
       return -1; 
