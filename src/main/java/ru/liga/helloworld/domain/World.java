package ru.liga.helloworld.domain;

import java.util.List;

public class World {
    private final List<Country> countries;

    public World(List<Country> countries) {
        this.countries = countries;
    }

    public List<City> getAllCitiesNamesWithoutWhitespacesMoreSixteenSymbolsSortedByName() {
        //TODO: Реализовать
        return null;
    }

    public List<Country> getCountries() {
        return countries;
    }


    public long threeOrLessLetterNameOfCityCountryCount() {
        //TODO: Реализовать
        return -1;
    }


}
