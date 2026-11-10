class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        boolean isPalin = true;

        String str = "";
        for(int i=0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str += s.charAt(i);
            }
        }

        int start = 0;
        int end = str.length()-1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                isPalin = false;
                break;
            }

            start++;
            end--;
        }

        return isPalin;
    }
}