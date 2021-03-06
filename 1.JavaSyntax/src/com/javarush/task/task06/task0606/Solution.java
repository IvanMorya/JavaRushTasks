package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        int divider = 1;
        while (number/divider > 0) {
            int reminder = number/divider;
            if (reminder%2 == 0){
                even++;
            } else {
                odd++;
            }
            divider = divider*10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
