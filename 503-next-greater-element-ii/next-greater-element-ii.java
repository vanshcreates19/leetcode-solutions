class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[]=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        int last=nums[nums.length-1];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>last){
                ans[ans.length-1]=nums[i];
                break;
            }
        }
        for(int i=ans.length-2;i>=0;i--){
            st.push(nums[i]);
        }
        st.push(nums[nums.length-1]);
        int i=ans.length-2;
        while(i!=-1){
            if(nums[i]<st.peek()){
                ans[i]=st.peek();
                st.push(nums[i]);
                i--;
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(nums[i]);
                    ans[i]=-1;
                    i--;
                }
            }
        }
        return ans;
    }
}