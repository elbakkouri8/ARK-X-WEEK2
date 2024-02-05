package challenge3;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        if(stack.isEmpty()){
            System.out.println("stack is empty");
        }else System.out.println("stack is empty");

        stack.push("mohamed");
        System.out.println(stack);
        stack.push("brahim");
        System.out.println(stack);
        stack.push("said");
        System.out.println(stack);
        stack.push("hassan");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);


        System.out.println("peek of stack  : " + stack.peek());
        System.out.println(stack);
        if(stack.isEmpty()){
            System.out.println("stack is empty");
        }else System.out.println("stack is empty");
    }
}
