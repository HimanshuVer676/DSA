class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String res = "/";
        int n = path.length();

        for(int i=0; i<n; i++){
            while(i<n && path.charAt(i) == '/'){
                i++;
            }
            
            String dir = "";
            while(i<n && path.charAt(i) != '/'){
                dir += path.charAt(i);
                i++;
            }

            if(dir.equals("..")){
                if(!st.isEmpty()) st.pop(); 
            }
            else if(dir.equals(".") || dir.length() == 0){
                continue;
            }
            else{
                st.push(dir);
            }
        }

        Stack<String> st2 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());
        }

        while(!st2.isEmpty()){ 
            if(st2.size() != 1){
                res += (st2.pop() + "/");
            }else{
                res += st2.pop();
            }
        }

        return res;
    }
}