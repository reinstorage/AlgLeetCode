package 栈;

import java.util.Stack;

public class _20_有效的括号 {

    /*
     * 20.有效的括号
     * https://leetcode-cn.com/problems/valid-parentheses/
     */
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        int len = s.length();
        for (int i = 0; i< len; i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){ //左字符
                stack.push(c);
            }
            else {
                //右括号
                if(stack.isEmpty()) return false;
                char left = stack.pop();
                if (left == '(' && c != ')') return false;
                if (left == '{' && c != '}') return false;
                if (left == '[' && c != ']') return false;
            }

        }

        return stack.isEmpty();
    }
}
