public class LongestEvenSubstring {
    public static void main(String args[])
    {
        String string = "63";
        System.out.println(printLongestEvenSubstring(string));
    }
    public static String printLongestEvenSubstring(String string)
    {
        String result =" ";
        for(int i=string.length()-1;i>=0;i--)
        {
            if(Integer.parseInt(String.valueOf(string.charAt(i)))%2==0)
            {
                result = string.substring(0,i+1);
              break;
            }
        }
        return result;
    }
}
