import java.util.Dictionary;
import java.util.Hashtable;

class Solution {
    public int romanToInt(String s) {
        Dictionary<Character, Integer> dict= new Hashtable<>();
        int sum = 0;
        int currentChar = 0;
        int size = s.length();
        dict.put('I',1);
        dict.put('V',5);
        dict.put('X',10);
        dict.put('L',50);
        dict.put('C',100);
        dict.put('D',500);
        dict.put('M', 1000);

        for (int i = 0; i < size-1; i++) {
            currentChar = dict.get(s.charAt(i));
            if (currentChar >= dict.get(s.charAt(i+1))) {
                sum += currentChar;                
            }
            else
            {
                sum-= currentChar;
            }
        }
        return sum += dict.get(s.charAt(size-1));
    }
}