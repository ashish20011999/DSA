import java.util.HashMap;
import java.util.Map;

public class RomanToInteger{
    public static void main(String args[])
    {
        String roman = "MCMIV";
        System.out.println(RomanToIntegerConversion(roman));
    }
    public static int RomanToIntegerConversion(String roman)
    {   int result = 0;
        Map<Character,Integer> romanToIntegerMap = new HashMap<>();
        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);
        for(int i = 0;i<roman.length();i++)
        {
            if(i!=roman.length()-1 && (romanToIntegerMap.get(roman.charAt(i))<romanToIntegerMap.get(roman.charAt(i+1))))
            {
                result+=romanToIntegerMap.get(roman.charAt(i+1))-romanToIntegerMap.get(roman.charAt(i));
                i++;
            }
            else
            {
                result+=romanToIntegerMap.get(roman.charAt(i));
            }
        }
        return result;
    }
}
