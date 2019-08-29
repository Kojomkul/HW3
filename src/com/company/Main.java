package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Bill";
        System.out.println(names[0]);
        names[1] = "Will";
        System.out.println(names[1]);
        names[2] = "Lil";
        System.out.println(names[2]);
        for (int a = 1; a <= 3; a++)
            switch (a) {
                case 1:
                    System.out.println("Доброе утро" + " " + names[0]);
                    break;
                case 2:
                    System.out.println("Добрый день" + " " + names[1]);
                    break;
                case 3:
                    System.out.println("Добрый вечер" + " " + names[2]);
                    break;
            }
    }
}