import java.util.Arrays;

public class LongestPrefix {

    public static void main(String args[]) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(LongestPrefixCalculate(strs));
    }
    public static String LongestPrefixCalculate(String[] strs)
    {
        Arrays.sort(strs);
        String startingString = strs[0];
        String endingString = strs[strs.length-1];
        int i = 0;
        while(i<startingString.length() && i<endingString.length())
        {
            if(startingString.charAt(i)==endingString.charAt(i))
            {
                i++;
            }
            else
            {
                break;
            }
        }

        return startingString.substring(0,i);
    }
}
