class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total=0;
        for(int i=0;i<cardPoints.length;i++){
            total+=cardPoints[i];
          
        }
        if(k==cardPoints.length){
            return total;
        }
        int i =0;
        int j=cardPoints.length-k-1;
        int ans =0;
        int current=0;
        for(int m=i;m<=j;m++){
            current+=cardPoints[m];
        }

      for(i=0;i<k;i++){
        ans=Math.max(ans,(total-current));
        current-=cardPoints[i];
        j++;
        current+=cardPoints[j];
      }
        ans=Math.max(ans,(total-current));
       return ans;
    }
}