Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise direction) by D steps, where D is a positive integer. 
  
  class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        int a[]=new int[n];
          for(int i=0;i<arr.length;i++){
           a[i]=arr[(i+d)%n];
       }
       for(int i=0;i<arr.length;i++){
           arr[i]=a[i];
       }
        
    }
}
