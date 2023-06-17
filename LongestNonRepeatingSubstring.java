import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestNonRepeatingSubstring {
    public static int lengthOfLongestSubstring(String string) {
            Set<Character> charSet = new HashSet<>();
            int start = 0;
            int maxLength =0;
            if(string=="")
            {
                return 0;
            }
            if(string.length()>1&&Character.isWhitespace(string.charAt(0))||string==" ")
            {
                return 1;
            }
            Map<Character,Integer> map =new HashMap<>();
            for(int i=0;i<string.length();i++)
            {
                if(map.containsKey(string.charAt(i)))
                {
                    start=map.get(string.charAt(i));
                }
                map.put(string.charAt(i),i);
                maxLength = Math.max(maxLength,i-start);
            }
            return maxLength;
        }
    public static void main(String args[])
    {
        String string = "";
        System.out.println(lengthOfLongestSubstring(string));
    }
}
