class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            map1.put(ransomNote.charAt(i),map1.getOrDefault(ransomNote.charAt(i),0)+1);
        }
         for(int i=0;i<magazine.length();i++){
            map2.put(magazine.charAt(i),map2.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            if(map1.get(ransomNote.charAt(i))>map2.getOrDefault(ransomNote.charAt(i),0)){
                return false;
            }
        }
        return true;
    }
}