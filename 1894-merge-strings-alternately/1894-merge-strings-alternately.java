class Solution {
    public String mergeAlternately(String word1, String word2) {
       String newString = "";
        int index = 0;
        int len1 = word1.length();
        int len2 = word2.length();
        while (true) {
            if (index < len1 && index < len2) {
                newString += word1.charAt(index);
                newString += word2.charAt(index);
                index++;
                continue; 
            }
            else if (index==len1) {
                newString+=word2.substring(index);
                break;
            }
            else{
                newString+=word1.substring(index);
                break;
            }           
        }
        return newString;
    }
}