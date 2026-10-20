class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int start = 0;
        int end = skill.length-1;
        int ns = skill[start] + skill[end];
        long chemSum = 0;
        while(start < end){
            if(skill[start] + skill[end] == ns){
                chemSum += (long)skill[start++] * skill[end--];
            }else{
                return -1;
            }
        }

        return chemSum;
    }
}