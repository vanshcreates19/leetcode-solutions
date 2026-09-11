class Solution {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int guess=low+(high-low)/2;
           
        if(((guess==0)||(nums[guess]>nums[guess-1])) && ((guess==nums.length-1)|| nums[guess]>nums[guess+1])){
                return guess;
            }
            else if(nums[guess]<nums[guess+1]){
                low=guess+1;
            }
            else if(nums[guess]<nums[guess-1]){
                high=guess-1;
            }
        }
        return 0;
    }
}