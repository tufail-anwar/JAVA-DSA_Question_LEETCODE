class Solution {
    public String reverseVowels(String str) {

        int s = 0;
        int e = str.length() - 1;
        StringBuilder sb = new StringBuilder(str);
        while (s <= e) {
            char a = sb.charAt(s);
            char b = sb.charAt(e);
            boolean av = (a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||
                          a=='A'||a=='E'||a=='I'||a=='O'||a=='U');

            boolean bv = (b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||
                          b=='A'||b=='E'||b=='I'||b=='O'||b=='U');
            if (!av) {
                s++;
            } 
            else if (!bv) {
                e--;
            } 
            else {
                char temp = sb.charAt(s);
                sb.setCharAt(s, sb.charAt(e));
                sb.setCharAt(e, temp);
                s++;
                e--;
            }
        }

        return sb.toString();
    }
}