import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class MinimumSwaps
{
    public static void main(String args[])
    {
        String string ="))()((";
        System.out.println(MinimumSwapsCal(string));
    }
    public static int MinimumSwapsCal(String string)
    {
        Deque<Character> stack = new LinkedList<>();
        int right =0;
        int left=0;
        for(int i=0;i<string.length();i++)
        {   Character c = string.charAt(i);
            if(c=='(')
            {
                stack.push(c);
                left++;
            }
            else {
                right++;
                if(!stack.isEmpty() && c==')')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(c);
                }
            }
        }
        if(right==left)
        {
            return (stack.size()+1)/2;
        }
        else
            return -1;
    }

    public static int MinimumSwapsCal2(String string) //without using stack
    {
        int stack_size =0;
        int right =0;
        int left=0;
        for(int i=0;i<string.length();i++)
        {   Character c = string.charAt(i);
            if(c=='(')
            {
                stack_size++;
                left++;
            }
            else {
                right++;
                if(stack_size>0 && c==')')
                {
                    stack_size--;
                }
                else
                {
                   stack_size++;
                }
            }
        }
        if(right==left)
        {
            return (stack_size+1)/2;
        }
        else
            return -1;
    }
}
