import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanvalues= new HashMap<>();
        romanvalues.put('I', 1);
        romanvalues.put('V', 5);
        romanvalues.put('X', 10);
        romanvalues.put('L', 50);
        romanvalues.put('C', 100);
        romanvalues.put('D', 500);
        romanvalues.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length() - 1; i++){
            int currentValue = romanvalues.get(s.charAt(i));
            int nextValue = romanvalues.get(s.charAt(i+1));
            if (currentValue < nextValue ) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
        
        }
        total += romanvalues.get(s.charAt(s.length() - 1 ));
        return total;
    }
}