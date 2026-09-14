class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total=0;
        for(int i=0;i<cardPoints.length;i++){
            total+=cardPoints[i];
        }
        int i =0;
        int j=cardPoints.length-k-1;
        int ans =0;
        while(j<cardPoints.length){
            int current=0;
            for(int m=i;m<=j;m++){
                current+=cardPoints[m];
            }
            ans=Math.max(ans,(total-current));
            i++;
            j++;
        }
       return ans;
    }
}