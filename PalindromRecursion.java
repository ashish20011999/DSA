public class PalindromRecursion {
    public static void main(String args[])
    {
        String string = "abcaacba";
        int longest = 0;
        System.out.println(Palindrome(string,0,string.length()-1));
    }
    public static boolean Palindrome(String string, int start, int end)
    {
        if(start==end)
        {
            return true;
        }
        if(string.charAt(start)!=string.charAt(end))
        {
            return false;
        }
        if(start<end+1)
        {
           return Palindrome(string,start+1,end-1);
        }
        return true;
    }
}
