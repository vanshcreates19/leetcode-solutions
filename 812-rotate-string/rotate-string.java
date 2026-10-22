class Solution {
    public boolean rotateString(String s, String goal) {
        int k=0;
        StringBuilder sb1=new StringBuilder(s);
        StringBuilder sb2=new StringBuilder(goal);
        if(s.length()!=goal.length()){
            return false;
        }
        while(k<s.length()){
            if(sb1.toString().equals(sb2.toString())){
                return true;
            }
            else{
                char save=sb1.charAt(0);
           for(int i=0;i<s.length();i++){
              if(i==s.length()-1){
                sb1.setCharAt(i,save);
              }
              else{
                sb1.setCharAt(i,sb1.charAt(i+1));
              }
           }
           k++;
            }
        }
        return false;
    }
}