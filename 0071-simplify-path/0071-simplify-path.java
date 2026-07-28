class Solution {
    public String simplifyPath(String path) {
        // Stack<String> st = new Stack<>();
        // String res = "/";
        // int n = path.length();

        // for(int i=0; i<n; i++){
        //     while(i<n && path.charAt(i) == '/'){
        //         i++;
        //     }
            
        //     String dir = "";
        //     while(i<n && path.charAt(i) != '/'){
        //         dir += path.charAt(i);
        //         i++;
        //     }

        //     if(dir.equals("..")){
        //         if(!st.isEmpty()) st.pop(); 
        //     }
        //     else if(dir.equals(".") || dir.length() == 0){
        //         continue;
        //     }
        //     else{
        //         st.push(dir);
        //     }
        // }

        // Stack<String> st2 = new Stack<>();
        // while(!st.isEmpty()){
        //     st2.push(st.pop());
        // }

        // while(!st2.isEmpty()){ 
        //     if(st2.size() != 1){
        //         res += (st2.pop() + "/");
        //     }else{
        //         res += st2.pop();
        //     }
        // }

        // return res;
        
        Stack<String> st = new Stack<>();
        String str1[] = path.split("/");
        String res = "/";

        for(String s : str1){
            if("..".equals(s)){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(".".equals(s) || "".equals(s)){
                continue;
            }else{
                st.push(s);
            }
        }

        Stack<String> st2 = new Stack<>();

        int i=0;
        while(!st.isEmpty()){
            str1[i++] = st.pop();
        }

        for(int j=i-1; j>=0; j--){
            if(j != 0){
                res = res+str1[j] + "/";
            }else{
                res = res+str1[j];
            }
        }
        // while(!st2.isEmpty()){
        //     if(st2.size()>1){
        //         res = res+st2.pop() + "/";
        //     }else{
        //         res = res+st2.pop();
        //     }
        // }

        return res;
    }
}