class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[max]){
                max=i;
            }
            else if(nums[i]<nums[min]){
                min=i;
            }
        }
        int delete=Integer.MAX_VALUE;
        if(max<min){
            delete=Math.min(delete,(max+1+nums.length-min));
            delete=Math.min(delete,min+1);
            delete=Math.min(delete,nums.length-max);
        }
        else{
            delete=Math.min(delete,(min+1+nums.length-max));
            delete=Math.min(delete,nums.length-min);
            delete=Math.min(delete,max+1);
        }
        return delete;
    }
}