class Solution {
    class Pair{
        char ch;
        int freq;
        Pair(char ch,int freq){
            this.ch=ch;
            this.freq=freq;
        }
    }  
     public String removeDuplicates(String s, int k) {
        int n=s.length();
       Stack<Pair> st=new Stack<>();
       for(int i=0;i<n;i++){
         if(st.isEmpty()){
            st.push(new Pair(s.charAt(i),1));
         }
         else if(st.peek().ch==s.charAt(i)){
            if(st.peek().freq==k-1){
                st.pop();
            }
            else{
                st.peek().freq++;
            }
         }
         else{
            st.push(new Pair(s.charAt(i),1));
         }
       }
       StringBuilder sb=new StringBuilder();
      while(!st.isEmpty()){
        Pair p=st.pop();
        for(int i=0;i<p.freq;i++){
            sb.append(p.ch);
        }
      }
      return sb.reverse().toString();
    }
}