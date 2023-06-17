import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ReverseInteger {
    public static void main(String args[])
    {
        int number = 321;
        System.out.println(reverseInteger(number));
    }
    public static int reverseInteger(int number)
    {
        String numberInString = String.valueOf(number);
        Deque<Character> stack  = new ArrayDeque<>();
        int start = 0;
        if(number<0)
        {
            start =1;
        }
        for(int i =start;i<numberInString.length();i++)
        {
            stack.push(numberInString.charAt(i));
        }
        String result ="";
        while(!stack.isEmpty())
        {
            result+=stack.pop();
        }
        if(start==1)
        {
            result="-"+result;
        }
        try {
            Integer.parseInt(result);
            return Integer.parseInt(result);
        }
        catch(Exception e){
            return 0;
            }
    }
}
