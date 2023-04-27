//******************************************************************
//  Activity 32
//  Name: Ben Keys
//  Data Structures Date: 03/31/2023
//******************************************************************
//  A demo of stacks.
//******************************************************************

import java.util.Stack;

public class BalancedBrackets {
    boolean checkString(String value) {
        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                brackets.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (brackets.isEmpty() ||
                        (c == ')' && brackets.peek() != '(') ||
                        (c == ']' && brackets.peek() != '[') ||
                        (c == '}' && brackets.peek() != '{')
                ) {
                    return false;
                }
                brackets.pop();
            }
        }

        return brackets.isEmpty();
    }
}
