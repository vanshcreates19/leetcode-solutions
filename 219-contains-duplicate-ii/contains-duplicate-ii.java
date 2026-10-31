class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     int low=0;
     int high=0;
     HashMap<Integer,Integer> map=new HashMap<>();
    for(high=0;high<nums.length;high++){
       map.put(nums[high],map.getOrDefault(nums[high],0)+1);
       while(Math.abs(low-high)>k){
        map.put(nums[low],map.get(nums[low])-1);
        low++;
       }
       if(map.getOrDefault(nums[high],0)>=2 && Math.abs(low-high)<=k){
        return true;
       }
    }
    return false;
    }
}