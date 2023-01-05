package com.lecture.stack;

import java.util.Scanner;
import java.util.Stack;

public class Crane {
    public static void main(String[] args) {
        Crane crane = new Crane();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++){
            moves[i] = kb.nextInt();
        }
        System.out.println(crane.solution(n, board, m, moves));
    }

    private int solution(int n, int[][] board, int m, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int value = board[j][moves[i]-1];
                if(value!=0){
                    if(!stack.isEmpty() && stack.peek().equals(value)){
                        stack.pop();
                        answer += 2;
                    } else{
                        stack.push(value);
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        return answer;

    }
}
