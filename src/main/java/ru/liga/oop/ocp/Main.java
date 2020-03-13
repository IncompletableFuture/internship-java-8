package ru.liga.oop.ocp;

/**
 * Created by dzharkov on 13.03.2020.
 */

public class Main {
    public static void main(String[] args) {
        ReportBuilder reportBuilder = new ReportBuilder(new Logger());
        reportBuilder.build();
    }
}
