package Lect4.task5;

import java.util.Stack;

public class programm {
    public static void main(String[] args) {
        var exp = "1 2 3 * +".split(" ");
        int res = 0;
        System.out.println(exp);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}
