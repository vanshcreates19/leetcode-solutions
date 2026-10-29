class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st =new Stack<>();
        int i=0;
        while(i<asteroids.length){
            if(st.isEmpty()){
               st.push(asteroids[i]);
               i++;
            }
            else if(asteroids[i]>0){
                st.push(asteroids[i]);
                i++;
            }
            else if(st.peek()>0 && asteroids[i]<0){
                boolean alive=true;
                if(st.peek()==Math.abs(asteroids[i])){
                    st.pop();
                    i++;
                }
                else if(st.peek()>Math.abs(asteroids[i])){
                    i++;
                }
                else{
               while(!st.isEmpty() && (st.peek()<Math.abs(asteroids[i]) && st.peek()>0)){
               
             st.pop();
             if(!st.isEmpty() && st.peek()==Math.abs(asteroids[i])){
                    st.pop();
                alive=false;
                break;
                }
                else if(!st.isEmpty() && st.peek()>Math.abs(asteroids[i])){
                    alive=false;
                    break;
                }
                
               }
          if(alive){
            st.push(asteroids[i]);
          }
               i++;
                }
            }
            else if(st.peek()<0 && asteroids[i]<0){
                st.push(asteroids[i]);
                i++;
            }
            else{
                i++;
            }
        }
        int ans[]=new int[st.size()];
        int j=ans.length-1;
        while(!st.isEmpty()){
            ans[j]=st.peek();
            st.pop();
            j--;
        }
        return ans;
    }
}