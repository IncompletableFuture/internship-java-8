package ru.liga.oop.dip;

import ru.liga.oop.dip.report.Reporter;

/**
 * Created by dzharkov on 13.03.2020.
 */

public class Main {
    public static void main(String[] args) {
        Reporter reporter = new Reporter();
        reporter.sendReports();
    }
}
