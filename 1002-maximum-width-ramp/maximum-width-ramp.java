class Solution {
    public int maxWidthRamp(int[] nums) {
        int j=0;
        int ans=0;
        Stack<Integer> st=new Stack<>();
        while(j!=nums.length){
            if(st.isEmpty()){
                st.push(j);
                j++;
            }
            else if(nums[j]<nums[st.peek()]){
                st.push(j);
                j++;
            }
            else{
                j++;
            }
        }
        j--;
       while(!st.isEmpty() || j==0){
        if(st.isEmpty()){
            break;
        }
       else if(nums[j]>=nums[st.peek()]){
            while(!st.isEmpty() && nums[j]>=nums[st.peek()]){
            ans=Math.max(ans,(j-st.peek()));
            st.pop();
            }
            j--;
        }
        else{
            j--;
        }
       }
       return ans;
    }
}