class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)==')'){
                st.push(i);
                break;
            }
        }
        i++;
        while(i<s.length()){
            if(st.isEmpty() && (s.charAt(i)=='(' || s.charAt(i)==')') ){
                 st.push(i);
            i++;
            }
            else if(st.isEmpty()){
                i++;
            }
         else if(s.charAt(st.peek())=='(' && s.charAt(i)==')'){
            st.pop();
            i++;
           }
           else if(s.charAt(i)=='(' || s.charAt(i)==')'){
            st.push(i);
            i++;
           }
           else{
            i++;
           }
        }
        if(st.isEmpty()){
         return s;
        }
        
         for(int j=s.length()-1;j>=0;j-- ){
            if( !st.isEmpty() && j==st.peek()){
                st.pop();
                continue;
            }
            sb.append(s.charAt(j));
         }
        return sb.reverse().toString();
    }
}