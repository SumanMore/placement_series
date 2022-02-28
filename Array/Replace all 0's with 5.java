class GfG {
    int convertfive(int num) {
        // Your code here
        
        String s=Integer.toString(num);
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]=='0')
           {
               arr[i]='5';
           }
        }
        String str=new String(arr);
        int n=Integer.parseInt(str);
        return n;
    }
}
