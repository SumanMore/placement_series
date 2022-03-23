class Solution {
    
    public long totalFine( long n, long date, long car[], long fine[])
    {
        long res=0;
        for(int i=0;i<n;i++)
        {
            if(date%2==0)
            {
                if(car[i]%2!=0)
                {
                    
                  res=res+fine[i]; 
                }
                
            }
            else
            {
                 if(car[i]%2==0)
                {
                    
                  res=res+fine[i]; 
                }
                
            }
        }
    
    return res;
}
}
