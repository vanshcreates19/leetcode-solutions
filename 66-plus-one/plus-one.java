class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        boolean x=true;
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=9){
            x=false;
            break;
            }
        }
        if(x==true){
            int[] ans=new int[digits.length+1];
            ans[0]=1;
            for(int i=1;i<ans.length;i++){
                ans[i]=0;
            }
            return ans;
        }
        if(digits[n-1]!=9){
            digits[n-1]=digits[n-1]+1;
            return digits;
        }
        int i=digits.length-1;
        if(x==false){
          while(i>0 && digits[i]==9){
            digits[i]=0;
           if(digits[i-1]!=9){
            digits[i-1]=digits[i-1]+1;
            break;
           }
            i=i-1;
          }
        }
        return digits;
    }
}