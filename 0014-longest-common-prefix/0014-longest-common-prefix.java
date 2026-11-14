class Solution {
    public class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
        }
    }

    public Node root = new Node();

    public void insert(String word){
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public String longestCommonPrefix(String[] strs) {
        for(int i=0; i<strs.length; i++){
            insert(strs[i]);
        }

        StringBuilder ans = new StringBuilder();
        Node curr = root;

        while (true) {
            int count = 0;
            int idx = -1;

            for (int i = 0; i < 26; i++) {
                if (curr.children[i] != null) {
                    count++;
                    idx = i;
                }
            }

            if (count != 1 || curr.eow) {
                break;
            }

            ans.append((char)(idx + 'a'));
            curr = curr.children[idx];
        }

        return ans.toString();
    }
}