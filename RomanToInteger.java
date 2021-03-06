import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    //solution 1
    public static int romanToInt(String s) {

        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            number += symbolToValue(s.charAt(i));
            if (i != 0) {
                if ((s.charAt(i) == 'V' || s.charAt(i) == 'X') && s.charAt(i - 1) == 'I') {
                    number -= 2;
                } else if ((s.charAt(i) == 'L' || s.charAt(i) == 'C') && s.charAt(i - 1) == 'X') {
                    number -= 20;
                } else if ((s.charAt(i) == 'D' || s.charAt(i) == 'M') && s.charAt(i - 1) == 'C') {
                    number -= 200;
                }
            }
        }

        return number;
    }

    public static int symbolToValue(Character c) {
        int value = 0;
        switch (c) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
            default:
                value = 0;
        }

        return value;
    }

    //solution 2
    public static final Map<Character, Integer> roman = new HashMap<>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    public static int romanToInteger(String s) {

        int value = 0;
        int size = s.length();

        for (int i = 0; i < size; i++) {
            if (i != size -1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                value = value + roman.get(s.charAt(i+ 1)) - roman.get(s.charAt(i));
                i++;
            } else {
                value += roman.get(s.charAt(i));
            }
        }

        return value;
    }
 
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInteger(s));
    }
}
