package Stack;

import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {
    static boolean balancedbrackets(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '{' || x == '(' || x == '[') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char check;
            switch (x) {
                case '}':
                    check = stack.pop();
                    if (check == '[' || check == '(')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(')
                        return false;
                    break;
                case ')':
                    check = stack.pop();
                    if (check == '[' || check == '{')
                        return false;
                    break;

            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        if (balancedbrackets(s)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

    }
}