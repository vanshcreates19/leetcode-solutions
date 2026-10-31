class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int low=0;
        int high=s1.length()-1;
        if(s1.length()>s2.length()){
            return false;
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
           map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
        }
        HashMap<Character,Integer> temp=new HashMap<>();
           for(int i=low;i<=high;i++){
                temp.put(s2.charAt(i),temp.getOrDefault(s2.charAt(i),0)+1);
            }
        while(high!=s2.length()){
            int j=0;
            for(int i=0;i<s1.length();i++){
                if(!map1.get(s1.charAt(i)).equals(temp.getOrDefault(s1.charAt(i),0))){
                    temp.put(s2.charAt(low),temp.get(s2.charAt(low))-1);
                    low++;
                    high++;
                    if(high==s2.length()){
                        break;
                    }
                     temp.put(s2.charAt(high),temp.getOrDefault(s2.charAt(high),0)+1);
                    break;
                }
                j++;
            }
            if(j==s1.length()){
                return true;
            }
        }
        return false;
    }
}