class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        int num=0;
        for(int i=0;i<chars.length;i=i+num){
            num=0;
            for(int j=i;j<chars.length;j++){
                if(chars[j]==chars[i]){
                num++;
                }
                else{
                    break;
                }
            }
             if(num==1){
                    sb.append(chars[i]);
                }
                else{
                    sb.append(chars[i]);
                    sb.append(num);
                }
        }
        int i=0;
        while(i!=sb.length() && i<chars.length){
            chars[i]=sb.charAt(i);
            i++;
        }
        return sb.length();
    }
}