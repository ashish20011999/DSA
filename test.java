import java.util.HashSet;
import java.util.Set;

public class test {
    public static int startMarker(String string, int n)
    {
        int result = 0;
        int start = 0;
        Set<Character> charset= new HashSet<>();
        for(int i =0;i<n&&start!=n;i++)
        {
            if(charset.contains(string.charAt(i)))
            {
                start=0;
            }
            else
            {
                start++;
                charset.add(string.charAt(i));
                result++;
            }
        }
        return result;
    }
    public static void main(String args[])
    {

    }
}
