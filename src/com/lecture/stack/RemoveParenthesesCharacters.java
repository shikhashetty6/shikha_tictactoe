package com.lecture.stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParenthesesCharacters {
    public static void main(String[] args) {
        RemoveParenthesesCharacters removeParenthesesCharacters = new RemoveParenthesesCharacters();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(removeParenthesesCharacters.solution(s));
    }

    private String solution(String s) {
        Stack<Character> stack = new Stack<>();
        String answer = "";
        for (char c : s.toCharArray()) {
            if(c==')'){
                while(stack.pop()!='(');
            } else{
                stack.push(c);
            }
        }
        for(int i=0; i<stack.size(); i++) answer+=stack.get(i);
        return answer;
    }
}
