class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int cnt = 0;

        // skip trailing spaces
        while(i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // count last word
        while(i >= 0 && s.charAt(i) != ' ') {
            cnt++;
            i--;
        }

        return cnt;
    }
}