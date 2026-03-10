package employe;


import java.util.Stack;

public class stack {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);  // Push opening brackets onto the stack
            } else {
                // If stack is empty or top of stack doesn't match closing bracket, return false
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets were properly closed; otherwise, return false ()[]{}
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "()[]{}";

        boolean result = isValid(input);

        System.out.println("Is the input \"" + input + "\" valid? " + result);
    }
}

