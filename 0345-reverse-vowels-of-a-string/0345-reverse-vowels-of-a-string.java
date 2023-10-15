class Solution {
    public String reverseVowels(String s) {
        List<Character> list=new ArrayList<Character>();  
        int size = s.length();
        for (int i = size-1; i >= 0; i--) {
            if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A'|| s.charAt(i)=='E'|| s.charAt(i)=='I'|| s.charAt(i)=='O'|| s.charAt(i)=='U') {
                list.add(s.charAt(i));
            }
        }
        String newString = "";
        for (int i = 0; i < size; i++) {
            if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A'|| s.charAt(i)=='E'|| s.charAt(i)=='I'|| s.charAt(i)=='O'|| s.charAt(i)=='U') {
            newString += list.get(0);
            list.remove(0);
            }
            else
            {
                newString+=s.charAt(i);
            }    
        }
        return newString;
    }
}