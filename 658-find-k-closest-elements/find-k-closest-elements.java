class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
      while(i<arr.length && arr[i]<=x){
        i++;
      }
      j=i;
      int l=i-1;
      if(i==0){
        while(k!=0){
            list.add(arr[i]);
            i++;
            k--;
        }
      }
      else{
        while((l>=0 || j<arr.length) &&k!=0){
             if(j>=arr.length && l>=0){
                list.add(arr[l]);
                l--;
                k--;
             }
             else if(l<0 && j<arr.length){
                 list.add(arr[j]);
                 j++;
                 k--;
             }
            else if(Math.abs(arr[l]-x)<Math.abs(arr[j]-x) || (Math.abs(arr[l]-x)==Math.abs(arr[j]-x) && arr[l]<arr[j])){
             list.add(arr[l]);
             l--;
             k--;
             }
             else{
                list.add(arr[j]);
                j++;
                k--;
             }
        }
      }
      Collections.sort(list);
      return list;
    }
}