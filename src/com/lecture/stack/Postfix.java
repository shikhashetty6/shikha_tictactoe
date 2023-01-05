package com.lecture.stack;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        Postfix postfix = new Postfix();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(postfix.solution(s));
    }

    private int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(!Character.isDigit(c)){
                Integer b = stack.pop();
                Integer a = stack.pop();
                if(c=='+'){
                    stack.push(a+b);
                } else if(c=='-'){
                    stack.push(a-b);
                } else if(c=='*'){
                    stack.push(a*b);
                } else if(c=='/'){
                    stack.push(a/b);
                }
            } else {
                stack.push(c-48);
            }
        }
        return stack.get(0);
    }
}
