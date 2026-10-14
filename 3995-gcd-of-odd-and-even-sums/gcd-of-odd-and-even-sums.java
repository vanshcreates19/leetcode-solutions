class Solution {
    public int gcdOfOddEvenSums(int n) {
       int odd=n*n;
       int even=n*(n+1);
     int in= Math.min(even,odd);
        for(int i=in;i>0;i--){
            if(even%i==0 && odd%i==0){
                return i;
            }
        }
        return 1;
    }
}