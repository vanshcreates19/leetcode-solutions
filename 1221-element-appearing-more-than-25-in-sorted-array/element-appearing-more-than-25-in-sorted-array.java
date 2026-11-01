class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(value>arr.length/4){
                return key;
            }
        }
        return 0;
    }
}