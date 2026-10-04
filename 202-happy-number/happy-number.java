class Solution {
    public boolean isHappy(int n) {
      ArrayList<Integer> list=new ArrayList<>();
      int num=n;
      int sum=0;
      while(n!=1){
        while(n!=0){
            int d=n%10;
            n=n/10;
            list.add(d);
        }
        if(list.size()==1 && list.get(0)==7){
            return true;
        }
        else if(list.size()==1){
            return false;
        }
        for(int i=0;i<list.size();i++){
            sum+=list.get(i)*list.get(i);
        }
        if(sum==1 || sum==7){
            return true;
        }
        else{
            if(sum==num){
                return false;
            }
            num=n;
            n=sum;
            sum=0;
            list.clear();
        }
      }
      return true;
    }
}