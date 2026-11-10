class Solution {
    public boolean isPalindrome(String s) {
        // s = s.toLowerCase();
        // boolean isPalin = true;

        // String str = "";
        // for(int i=0; i<s.length(); i++){
        //     if(Character.isLetterOrDigit(s.charAt(i))){
        //         str += s.charAt(i);
        //     }
        // }

        // int start = 0;
        // int end = str.length()-1;

        // while(start < end){
        //     if(str.charAt(start) != str.charAt(end)){
        //         isPalin = false;
        //         break;
        //     }

        //     start++;
        //     end--;
        // }

        // return isPalin;

        int start = 0; 
        int end = s.length()-1;

        while(start < end){
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }

            while(start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }

            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}