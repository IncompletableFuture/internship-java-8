package ru.liga.optional.domain;

import java.time.LocalDate;

/**
 * Created by dzharkov on 10.03.2020.
 */

public class Passport {
    private String fio;
    private LocalDate dateOfBirth;

    public Passport(String fio, LocalDate dateOfBirth) {
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFio() {
        return fio;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
