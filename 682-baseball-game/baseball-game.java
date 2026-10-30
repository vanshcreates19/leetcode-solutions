class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int i=0;
        while(i<operations.length){
            if(st.isEmpty()){
                st.push(Integer.parseInt(operations[i]));
                i++;
            }
            else if(operations[i].equals("C")){
                st.pop();
                i++;
            }
            else if(operations[i].equals("D")){
                st.push(2*st.peek());
                    i++;
            }
            else if(operations[i].equals("+")){
                int k=0;
                 int sum=0;
                    int sec=0;
                    int first=0;
                while(k!=2){
                    if(k==0){
                  sec=st.peek();
                  sum+=sec;
                 k++;
                 st.pop();
                    }
                    else{
                        first=st.peek();
                        sum+=first;
                        k++;
                    }
                }
                st.push(sec);
                    st.push(sum);
                    i++;
            }
            else{
                st.push(Integer.parseInt(operations[i]));
                i++;
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.peek();
            st.pop();
        }
        return ans;
    }
}