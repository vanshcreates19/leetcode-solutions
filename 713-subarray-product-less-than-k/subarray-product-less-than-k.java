class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            prod=nums[i];
            if(prod<k){
                count++;
            }
            else{
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
            prod=prod*nums[j];
            if(prod<k){
                count++;
            }
            else{
                break;
            }
            }
        }
        return count;
    }
}