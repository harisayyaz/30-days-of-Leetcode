class Solution {
    public String gcdOfStrings(String str1, String str2) {
       int len2= str2.length();
        int len1 = str1.length();
        int temp = 0;
        if ((str1+str2).equals(str2+str1)) {
            while (len2 != 0) {
                temp = len2;
                len2 = len1 % len2;
                len1 = temp;
            }
            return str1.substring(0, len1);
        }
        return "";
    }
}