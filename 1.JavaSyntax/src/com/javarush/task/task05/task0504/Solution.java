package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 2, 3, 5);
        Cat cat1 = new Cat("Hulk", 4, 15, 25);
        Cat cat2 = new Cat("Iron Cat", 7, 8, 20);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}