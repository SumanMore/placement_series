 ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                list.add(i+1);
            }
        }
        return list;
