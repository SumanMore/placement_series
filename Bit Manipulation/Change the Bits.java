class Solution {
    static int[] changeBits(int N) {
        // code here
        int arr[]=new int[2];
        String s=Integer.toBinaryString(N);
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='0')
            {
                ch[i]='1';
            }
        }
        String res=new String(ch);
        int res1=Integer.parseInt(res,2);
        arr[1]=res1;
        arr[0]=res1-N;
        return arr;
        }
};
