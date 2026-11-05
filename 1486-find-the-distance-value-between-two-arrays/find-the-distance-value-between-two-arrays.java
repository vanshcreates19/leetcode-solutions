class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int low=0;
        int high=arr2.length-1;
        int count=0;
        for(int i=0;i<arr1.length;i++){
            low=0;
            high=arr2.length-1;
            boolean check=true;
            while(low<=high){
                int guess=low+(high-low)/2;
                if(Math.abs(arr1[i]-arr2[guess])<=d){
                    check=false;
               break;
                }
                else if(arr1[i]>arr2[guess]){
               low++;
                }
                else{
                    high--;
                }
            }
            if(check){
                count++;
            }
        }
        return count;
    }
}