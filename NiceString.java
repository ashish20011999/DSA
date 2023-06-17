import java.util.HashSet;
import java.util.Set;

public class NiceString {
    public static void main(String args[])
    {
        String string = "YazaAay";
        System.out.println(LongestNiceSubstring(string));
    }
    public static String LongestNiceSubstring(String string)
    {   String result = "";
        Set<Character> charSet = new HashSet<>();
        for(int i=0;i<string.length();i++)
        {
            charSet.add(string.charAt(i));
        }
        for(int i=0;i<string.length();i++)
        {
            if((Character.isUpperCase(string.charAt(i))&&charSet.contains(Character.toLowerCase(string.charAt(i))))||(Character.isLowerCase(string.charAt(i))&&charSet.contains(Character.toUpperCase(string.charAt(i)))))
            {
                result+=string.charAt(i);
                continue;
            }
            String s1 = LongestNiceSubstring(string.substring(0,i));
            String s2 = LongestNiceSubstring(string.substring(i+1,string.length()));
            if(s1.length()>s2.length())
            {
                return s1;
            }
            else
                return s2;
        }
        return result;
    }
}
