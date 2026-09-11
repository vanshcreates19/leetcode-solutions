class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        int index1=0;
        int index2=n;
        for(int i =0;i<2*n;i++){
           if(i%2==0){
            arr[i]=nums[index1];
            index1++;
           }
           else{
           arr[i]=nums[index2];
           index2++;
           }
        }
        return arr;
    }
}