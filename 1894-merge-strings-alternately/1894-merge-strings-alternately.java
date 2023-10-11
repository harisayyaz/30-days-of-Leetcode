class Solution {
    public String mergeAlternately(String word1, String word2) {
         String newString = "";
        int index = 0;
        while (true) {
            if (index < word1.length() && index < word2.length()) {
                newString += word1.charAt(index);
                newString += word2.charAt(index);
                index++;
                continue; 
            }
            else if (index==word1.length()) {
                newString+=word2.substring(index);
            }
            else{
                newString+=word1.substring(index);
            }
        break;            
        }
        return newString;
    }
}