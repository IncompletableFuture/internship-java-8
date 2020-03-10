package ru.liga.optional;

import ru.liga.optional.domain.Passport;
import ru.liga.optional.repo.PassportRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;

/**
 * Created by dzharkov on 10.03.2020.
 */

public class Task {

    private static BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    private static PassportRepository repository = new PassportRepository();

    public static void main(String[] args) throws IOException {
        System.out.println("Введите ФИО:");
        String fio = console.readLine();

        List<Passport> passports = repository.fetchAllPassports();
        Optional<Passport> found = findByName(passports, fio);
        printResult(found);
    }

    private static Optional<Passport> findByName(List<Passport> passports, String fio) {
        //TODO: реализовать поиск по коллекции
        return null;
    }

    private static void printResult(Optional<Passport> passport) {
        //TODO: реализовать отображение результата
    }
}
