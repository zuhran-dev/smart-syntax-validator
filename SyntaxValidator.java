import java.util.*;
public class SyntaxValidator {
    public static boolean isBalanced(String expression){
        Stack<Character> stack = new Stack<>();
        boolean hasBrackets = false;
        for (int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
                 hasBrackets = true;
            }else if (ch == ')' || ch == '}' || ch ==']'){
                hasBrackets = true;
                if (stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{' || (ch == ']' && top != '['))){
                    return false;
                }
            }
        }
        if (!hasBrackets){
            return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("    DSA Smart Validator (Stack)    ");
        System.out.println("===================================");

        System.out.print("Enter An Expression:  ");

        String input = sc.nextLine();
        if (isBalanced(input)){
            System.out.println("\n[Valid] All brackets are properly balanced!");
        }
        else {
            System.out.println("\n [Error] Unbalanced brackets detected.");
        }
        sc.close();
    }
}
