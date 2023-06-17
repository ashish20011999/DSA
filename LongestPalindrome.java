public class LongestPalindrome {
    public static void main(String args[])
    {
        String s="abcaacbs";;
        System.out.println(LongestPalindromeCal(s,0,s.length()-1));
    }

    public static int LongestPalindromeCal(String s, int start, int end)
    {   int temp=0;
        if(start==end)
        {
            return 1;
        }
        if(checkPalindrome(s,start,end))
        {
            return end-start;
        }
        int length1=LongestPalindromeCal(s,start+1,end);
        int length2=LongestPalindromeCal(s,start,end-1);
        temp =  Math.max(length2,length1);
        if(temp>1)
        {
            return temp;
        }
        return 1;
    }
    public static boolean checkPalindrome(String s,int start, int end)
    {
        if(start==end)
        {
            return true;
        }
        else if(s.charAt(start)!=s.charAt(end))
            return false;
        else if(start<end)
        {
            checkPalindrome(s,start++,end--);
        }
        return true;
    }
}
