import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ParenthesesChecker {
    public static void main(){
        String parentheses = "[()]{}{[()()]()}";
        System.out.println(parenthesesCheck(parentheses));
    }
    private static boolean parenthesesCheck(String parentheses){
        char[] string = parentheses.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < string.length; i++)
        {
            if(string[i]=='('||string[i]=='['||string[i]=='{')
                stack.push(string[i]);
            if(stack.isEmpty())
                return false;
            char check;
            switch (string[i]) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }

        }
        if(stack.isEmpty())
            return true;
        else return false;
    }
}
