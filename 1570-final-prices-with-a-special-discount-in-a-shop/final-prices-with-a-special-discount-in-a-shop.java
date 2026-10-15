class Solution {
    public int[] finalPrices(int[] prices) {
        int answer[]=new int[prices.length];
        Stack<Integer> st=new Stack<>();
        int n=prices.length;
        st.push(n-1);
        int i=n-2;
        answer[n-1]=prices[n-1];
        while(i!=-1){
            if(prices[i]>=prices[st.peek()]){
           answer[i]=prices[i]-prices[st.peek()];
           st.push(i);
           i--;
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                    answer[i]=prices[i];
                    i--;
                }
            }
        }
        return answer;
    }
}