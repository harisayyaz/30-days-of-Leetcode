class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(t)) return true;
        if(s.equals("")) return true;
        int p1 = 0;
        int size = t.length();
        int size2 = s.length();
        for (int i = 0; i < size; i++) {
            if (t.charAt(i) == s.charAt(p1)) {
                p1++;
            }
            if(p1>=size2) return true;
        }
        return p1==s.length();
    }
}