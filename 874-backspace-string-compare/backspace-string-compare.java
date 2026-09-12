class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1=new StringBuilder(s);
        StringBuilder sb2=new StringBuilder(t);

        for(int i =0;i<sb1.length();i++){
            if(sb1.charAt(i)=='#'){
                if(i==0){
                    sb1.deleteCharAt(i);
                    i--;
                    continue;
                }
                sb1.deleteCharAt(i);
                sb1.deleteCharAt(i-1);
                i=i-2;
            }
        }
        for(int i =0;i<sb2.length();i++){
            if(sb2.charAt(i)=='#'){
                if(i==0){
                    sb2.deleteCharAt(i);
                    i--;
                    continue;
                }
                sb2.deleteCharAt(i);
                sb2.deleteCharAt(i-1);
                i=i-2;
            }
        }
        if(sb1.length()!=sb2.length()){
            return false;
        }
        for(int i=0;i<sb1.length();i++){
            if(sb1.charAt(i)!=sb2.charAt(i)){
                return false;
            }

        }
        return true;
    }
}