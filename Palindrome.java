import java.security.SecureRandom;

public class Palindrome {
    public static void main(String args[])
    {
        int x = 10;
        System.out.println(CheckIfPalindrome(String.valueOf(x)));
    }
    static void removeSpecialCharacter(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {

            // Finding the character whose
            // ASCII value fall under this
            // range
            if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' &&
                    s.charAt(i) < 'a' || s.charAt(i) > 'z')
            {

                // erase function to erase
                // the character
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
            }
        }
        System.out.print(s);
    }
    public static boolean CheckIfPalindrome(String number)
    {   removeSpecialCharacter(number);
        int start = 0;
        int end = number.length()-1;
        if(end%2==0)
        { //for even number of characters in a string
            while(start<end)
            {
                if(number.charAt(start)==number.charAt(end))
                {
                    start++;
                    end--;
                }
                else
                {
                    return false;
                }
            }
        }
        else{
            //for odd number of characters in a string
            while(start<=end)
            {
                if(number.charAt(start)==number.charAt(end))
                {
                    start++;
                    end--;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}
