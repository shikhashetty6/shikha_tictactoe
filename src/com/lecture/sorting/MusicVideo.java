package com.lecture.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo {
    public static void main(String[] args) {
        MusicVideo musicVideo = new MusicVideo();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = kb.nextInt();
        }
        System.out.println(musicVideo.solution(n, m, array));
    }

    private int solution(int n, int m, int[] array) {
         int answer = 0;
         int lt = Arrays.stream(array).max().getAsInt();
         int rt = Arrays.stream(array).sum();
         while (lt<=rt){
             int mid = (lt+rt)/2;
             if(count(array, mid)<=m){
                 answer = mid;
                 rt = mid -1;
             }
             else lt = mid +1;
         }
         return answer;
    }

    private int count(int[] array, int capacity){
        int cnt = 1, sum = 0;
        for(int x : array){
            if(sum+x>capacity){
                cnt++;
                sum = x;
            }
            else sum+=x;
        }
        return cnt;
    }
}
