 public static void convertToWave(int arr[], int n){
        
        // Your code here
       int n1 =n%2==0 ? n:n-1;
       for(int i=0;i<n1;i++)
       {
          int temp=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;
          i++;
           
       }
       
        
    }
