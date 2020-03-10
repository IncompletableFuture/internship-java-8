package ru.liga.employee;

import ru.liga.employee.domain.Employee;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        List<String> strings = namesOfYoungAndRichEmployees(Arrays.asList(
                new Employee("Витя", 20, 110000),
                new Employee("Константин Иванович", 38, 90000),
                new Employee("Владислав Игнатьевич", 37, 300000),
                new Employee("Настя", 19, 190000)));
        System.out.println(strings);
    }

    public static List<String> namesOfYoungAndRichEmployees(List<Employee> allEmployees) {
        throw new NotImplementedException();
    }
}
