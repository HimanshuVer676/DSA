class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<asteroids.length; i++){
            boolean exploded = false;
            int ast = asteroids[i];

            while(!st.isEmpty() && st.peek() > 0 && ast < 0){
                if(st.peek() < -ast){
                    st.pop();
                    continue;
                }else if(st.peek() == -ast){            // -ast == Math.abs(ast);
                    st.pop();
                }
                exploded = true;
                break;            
            }

            if(!exploded){
                st.push(ast);
            }
        }

        int ans[] = new int[st.size()];
        for(int i=st.size()-1; i>=0; i--){
            ans[i] = st.pop();
        }

        return ans;
    }
}