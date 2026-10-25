class Solution {
    public int reverse(int x) {
        String s1=String.valueOf(x);
        StringBuilder sb=new StringBuilder();
        for(int i=s1.length()-1;i>=0;i--){
            if(s1.charAt(i)=='-'){
                sb.insert(0,'-');
                break;
            }
         sb.append(s1.charAt(i));
        }
        String s2=sb.toString();
        try {
    return Integer.parseInt(s2);
} catch (NumberFormatException e) {
    return 0;
}
    }
}