class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int i=n-2;
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        int ans[]=new int[n];
        ans[n-1]=0;
        while(i!=-1){
            if(temperatures[i]<temperatures[st.peek()]){
               ans[i]=st.peek()-i;
               st.push(i);
               i--;
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    ans[i]=0;
                    st.push(i);
                    i--;
                }
            }
        }
        return ans;
    }
}