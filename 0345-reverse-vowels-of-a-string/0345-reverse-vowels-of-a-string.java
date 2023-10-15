class Solution {
     public static String reverseVowels(String s) {
        Stack<Character> stack=new Stack<Character>();  
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (isVowel(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
        }
        String newString = "";
        for (int i = 0; i < size; i++) {
            if (isVowel(s.charAt(i)) ) {
            newString += stack.pop();
            }
            else
            {
                newString+=s.charAt(i);
            }    
        }
        return newString;
    }

    public static boolean isVowel(char x){
        if (x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A'|| x=='E'|| x=='I'|| x=='O'|| x=='U') {
            return true;
        }
        return false;
    }
}