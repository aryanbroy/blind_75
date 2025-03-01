import java.util.*;

public class q16 {
    public static void main(String args[]) {

    }

    public static boolean isValid(String str) {

        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == '(' || curr == '[' || curr == '{') {
                stk.push(curr);
            } else {
                if (stk.isEmpty()) {
                    return false;
                }

                char ch = stk.pop();
                if ((ch == '(' && curr == ')') || (ch == '{' && curr == '}') || (ch == '[' && curr == ']')) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        if (!stk.isEmpty()) {
            return false;
        }

        return true;
    }
}
