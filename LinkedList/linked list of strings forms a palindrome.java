class GfG
{
    public static boolean compute(Node node)
    {
        String s="";
        
        Node n=node;
        while(n!=null)
        {
            s=s+n.data;
            n=n.next;
        }
        String rev="";
        for(int i=0;i<s.length();i++)
        {
           rev=s.charAt(i)+rev; 
        }
        if(s.equals(rev))
        {
            return true;
        }
        return false;
        
        
    }
}
