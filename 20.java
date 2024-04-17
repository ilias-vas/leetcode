// firstly, check if the string is even, if it isnt just return false
// create a stack with type character
// loop through the string, if its an opening brace push the character to the top of the stack
// else if its a closing brace, pop it from the stack
// if it doesnt meet any of these statements, just return false
// outside of the loop return the value of stack.isEmpty

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false; 
        }

        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
