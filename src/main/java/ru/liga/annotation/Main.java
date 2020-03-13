package ru.liga.annotation;

/**
 * Created by dzharkov on 13.03.2020.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(readSecretField(new A("123")));
    }

    private static String readSecretField(Object o) {
        return null;
    }
}
