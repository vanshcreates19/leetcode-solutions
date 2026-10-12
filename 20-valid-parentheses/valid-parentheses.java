class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
        int i=1;
        while(i!=s.length()){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                i++;
            }
          else  if((st.peek()=='(' && s.charAt(i)==')') || (st.peek()=='[' && s.charAt(i)==']') || (st.peek()=='{' && s.charAt(i)=='}')){
                st.pop();
                i++;
            }
            else{
                st.push(s.charAt(i));
                i++;
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}