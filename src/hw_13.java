
import java.util.Stack;

public class hw_13 {

    public static void main(String[] args) {
        String n = "(), [ ] ";
        isValid(n);
        System.out.println(isValid(n));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else if (st.empty()) {
                return false;
            } else if (st.peek() == '{' && s.charAt(i) == '}') {
                st.pop();
            } else if (st.peek() == '(' && s.charAt(i) == ')') {
                st.pop();
            } else if (st.peek() == '[' && s.charAt(i) == ']') {
                st.pop();
            } else {
                return false;
            }
        }

        return st.isEmpty();
    }
}