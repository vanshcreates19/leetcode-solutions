class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if("aeiouAEIOU".indexOf(sb.charAt(i))!=-1 && "aeiouAEIOU".indexOf(sb.charAt(j))!=-1){
               char temp=sb.charAt(j);
               sb.setCharAt(j,sb.charAt(i));
               sb.setCharAt(i,temp);
               i++;
               j--;
            }
        else if("aeiouAEIOU".indexOf(sb.charAt(i))!=-1 ){
            j--;
        }
        else if("aeiouAEIOU".indexOf(sb.charAt(j))!=-1){
            i++;
        }
        else{
            i++;
            j--;
        }
        }
        return sb.toString();
    }
}