class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        HashSet<Character> used=new HashSet<>();
        if(word1.length()!=word2.length()){
            return false;
        }
        for(int i=0;i<word2.length();i++){
            map1.put(word1.charAt(i),map1.getOrDefault(word1.charAt(i),0)+1);
         map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
        }
       for(Character key1:map1.keySet()){
        boolean pres=false;
        for(Character key2:map2.keySet()){
          if(key1.equals(key2)){
            pres=true;
            break;
          }
        }
        if(pres==false){
            return false;
        }
       }
   for(Character key1:map1.keySet()){
    boolean found=false;
    for(Character key2:map2.keySet()){
       if(!used.contains(key2) && map1.get(key1).equals(map2.get(key2))){
        found=true;
        used.add(key2);
        break;
       }
    }
    if(!found){
        return false;
    }
   }
   return true;
    }
}