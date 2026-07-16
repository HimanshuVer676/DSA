class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st = new Stack<>();

        int n = heights.length;
        int nextGreater[] = new int[n];

        // Next Greater element
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nextGreater[i] = n;
            }else{
                nextGreater[i] = st.peek();
            }

            st.push(i);
        }

        // Prev smaller element
        st = new Stack<>();
        int prevSmaller[] = new int[n];
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            if(st.isEmpty()){
                prevSmaller[i] = -1;
            }else{
                prevSmaller[i] = st.peek();
            }
            st.push(i);
        }
        
        int maxArea = 0;
        for(int k=0; k<n; k++){
            int j = nextGreater[k];
            int i = prevSmaller[k]; 
            int currArea = (j-i-1)*heights[k];
            maxArea = Math.max(maxArea, currArea); 
        }

        return maxArea;
    }
}