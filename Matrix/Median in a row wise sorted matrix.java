class Solution {
    int median(int matrix[][], int r, int c) {
        int res=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr.add(matrix[i][j]);
            }
        }
        Collections.sort(arr);
        int n=arr.size();
        if(n%2==0){
            int mid=n/2;
            res=(arr.get(mid-1)+arr.get(mid))/2;
        }
        else{
            int mid=(int)Math.floor(n/2);
            res=arr.get(mid);
        }
        return res;
    
    }
}
