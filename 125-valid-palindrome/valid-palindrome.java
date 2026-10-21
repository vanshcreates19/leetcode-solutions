class Solution {
    public boolean isPalindrome(String s) {      
        Stack<Character> st=new Stack<>();
       s= s.toLowerCase();
        int i=0;
        while(i!=s.length()){
            if(Character.isLetterOrDigit(s.charAt(i))){
                st.push(s.charAt(i));
                i++;
            }
            else{
                i++;
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
          sb.append(st.peek());
          st.pop();
        }
        int low=0;
        int high=sb.length()-1;
        while(low<high){
            if(sb.charAt(low)!=sb.charAt(high)){
                return false;
            }
            else{
                low++;
                high--;
            }
        }
        return true;
    }
}