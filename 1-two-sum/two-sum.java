class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;
        int a=0;
        int b=0;
        while(low<high){
            if(nums[low]+nums[high]==target){
                  a=nums[low];
                  b=nums[high];
                  break;
            }
            else if(nums[low]+nums[high]>target){
                high--;
            }
            else{
                low++;
            }
        }
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(arr[i]==a && ans[0]==0){
                ans[0]=i;
            }
            else if(arr[i]==b && ans[1]==0){
                ans[1]=i;
            }
        }
        return ans;
    }
}