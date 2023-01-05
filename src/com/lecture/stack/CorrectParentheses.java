package com.lecture.stack;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParentheses {
    public static void main(String[] args) {
        CorrectParentheses correctParentheses = new CorrectParentheses();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(correctParentheses.solution(s));
    }

    private String solution(String s) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c=='('){
                stack.add(c);
            } else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }
}
