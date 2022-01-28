package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        int deep = Thread.currentThread().getStackTrace().length;
        System.out.println(deep);
        return deep;
    }
}

