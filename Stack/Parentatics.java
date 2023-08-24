package Data_Structure.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Parentatics {

    public static boolean ValidFuntion(String name){
        char[] ch = name.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char ele : ch){
            if(ele=='(' || ele == '{' || ele == '['){
                stack.push(ele);
            } else if (stack.empty()) {
                return false;
            }else {
                char top = stack.pop();
                if (top=='(' && ele != ')' ) {
                    return false;
                }else if (top=='{' && ele != '}' ) {
                    return false;
                }
                else if (top=='[' && ele != ']' ) {
                    return false;
                }
            }
        }

        // this is used to search the stack is empty or not.
        return (stack.empty() == true);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string value: ");
        String name = sc.nextLine();
        boolean valid = ValidFuntion(name);
        System.out.print("Stack is valid or not? "+valid);
    }
}
