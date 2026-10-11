class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i!=s.length()){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                i++;
            }
           else if(st.peek()==s.charAt(i)){
                i++;
                st.pop();
            }
            else{
                st.push(s.charAt(i));
                i++;
            }
        }
       StringBuilder sb=new StringBuilder();
       while(!st.isEmpty()){
        sb.append(st.peek());
        st.pop();
       }
       return sb.reverse().toString();
    }
}