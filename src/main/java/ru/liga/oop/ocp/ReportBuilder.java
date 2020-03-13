package ru.liga.oop.ocp;

public class ReportBuilder {
    private Logger logger;

    public ReportBuilder(Logger logger) {
        this.logger = logger;
    }

    public String build() {
        String report = ""; //..логика отчета
        logger.log("Success!");
        return "";
    }
}