class Solution {
    public String removeOccurrences(String s, String part) {
        return remove(s, part);
    }
    public String remove(String p, String part) {
        if (!p.contains(part)) {
            return p;
        }
        int index = p.indexOf(part);
        String newStr = p.substring(0, index) + p.substring(index + part.length());
        return remove(newStr, part);
    }
}