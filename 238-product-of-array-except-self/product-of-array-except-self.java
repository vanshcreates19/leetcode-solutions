class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==0){
            count++;
          }
        }
        int prod=1;
        int ans[]=new int[nums.length];
        int times=0;
        if(count==0){
            for(int i=0;i<nums.length;i++){
            prod=prod*nums[i];
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                 times++;
                    continue;
                }
                prod=prod*nums[i];
            }
        }
        if(times==nums.length || count>1){
            for(int i=0;i<nums.length;i++){
                ans[i]=0;
            }
            return ans;
        }
        if(count==0){
            for(int i=0;i<nums.length;i++){
                ans[i]=prod/nums[i];
            }
        }
        else{
            for(int i=0;i<nums.length;i++){

                if(nums[i]==0){
                    ans[i]=prod;
                }
                else{
                    ans[i]=0;
                }
            }
        }
        return ans;
    }
}