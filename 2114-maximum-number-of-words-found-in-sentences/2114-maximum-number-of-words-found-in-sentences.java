class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < sentences.length; i++) {
            String str = sentences[i];
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch == ' ') {
                    count++;
                }

            }
            maxCount = Math.max(maxCount, count + 1);
        }

        return maxCount;
    }
}