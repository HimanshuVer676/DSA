class Solution {
    public long dividePlayers(int[] skill) {
        if(skill.length == 2){ 
            return (long)skill[0]*skill[1];
        }

        Arrays.sort(skill);
        int start = 0;
        int end = skill.length-1;
        int ns = skill[start] + skill[end];

        long chemSum = (long)skill[start++] * skill[end--];

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