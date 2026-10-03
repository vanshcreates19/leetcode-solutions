class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0;//considering as head ,as we used to do in cycle question
        int fast=0;//there next will be point ]ing to the nums[pointer]
        while(true){
            slow=nums[slow];//moving slow by 1
            fast=nums[fast];
            fast=nums[fast];//moving fast by 2 
            if(slow==fast){
                //cycle hai and meeting point pe hai
                slow=0;
                while(slow!=fast){
                    slow=nums[slow];
                    fast=nums[fast];
                }
                return slow;
           }
        }
     
    }
}