class Solution {
    public List<String> fizzBuzz(int n) {
      ArrayList<String> list=new ArrayList<>();
      int i=1;
      while(i<=n){
        if((i%3==0)&&(i%5==0)){
            list.add("FizzBuzz");
            i++;
        }
        else if(i%3==0){
            list.add("Fizz");
            i++;
        }
        else if(i%5==0){
            list.add("Buzz");
            i++;
        }
        else{
            list.add(String.valueOf(i));
            i++;
        }
      }
      return list;
    }
}