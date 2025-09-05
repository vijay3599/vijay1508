import java.util.Stack;

public class CheckParenthesis {

    
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
           
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false; 
                }
            }
        }

       
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "({[]})";
        String test2 = "([)]";
        String test3 = "((()))";

        System.out.println(test1 + " → " + isBalanced(test1)); 
        System.out.println(test2 + " → " + isBalanced(test2)); 
        System.out.println(test3 + " → " + isBalanced(test3)); 
    }
}
