package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    
    static {
        labels.put(2.0,"sdf");
        labels.put(3.0,"f");
        labels.put(4.0,"df");
        labels.put(5.0,"sf");
        labels.put(6.0,"d");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
