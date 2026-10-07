class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int low=1;
        int high=num/2;
        while(low<=high){
            int guess=low+(high-low)/2;
            if((long)guess*guess==num){
                return true;
            }
            else if((long)guess*guess>num){
                high=guess-1;
            }
            else{
                low=guess+1;
            }
        }
        return false;
    }
}