package practise.collectionsproogrampractise.java;

import java.util.Stack;

public class BalancedParentheses {

    // Function to check if the parentheses are balanced
    public static boolean isBalanced(String str) {
        // Stack to store opening parentheses
        Stack<Character> stack = new Stack<>();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If it's an opening parenthesis, push to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If it's a closing parenthesis, check the stack
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // If the stack is empty, it's unbalanced
                }

                char top = stack.pop(); // Pop the top element of the stack

                // Check if the popped element matches the type of closing parenthesis
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false; // Mismatched parentheses
                }
            }
        }

        // If the stack is empty, the parentheses are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test cases
        String str1 = "{[()]}";
        String str2 = "{[(])}";
        String str3 = "{[";

        System.out.println(str1 + " is balanced: " + isBalanced(str1));
        System.out.println(str2 + " is balanced: " + isBalanced(str2));
        System.out.println(str3 + " is balanced: " + isBalanced(str3));
    }
}
