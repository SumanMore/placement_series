class Compute {
    
    public long kthDiff(int arr[], int n, int k)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                list.add(Math.abs(arr[i] - arr[j]));
            }
        }
        Collections.sort(list);
        if(k > list.size())
            return 0;
        return list.get(k-1);
    }
}
