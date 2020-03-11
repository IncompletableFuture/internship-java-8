package ru.liga.helloworld.domain;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class World {
    private final List<Country> countries;

    public World(List<Country> countries) {
        this.countries = countries;
    }

    public List<City> getAllCitiesNamesWithoutWhitespacesMoreSixteenSymbolsSortedByName() {
        throw new NotImplementedException();
    }

    public List<Country> getCountries() {
        return countries;
    }


    public long threeOrLessLetterNameOfCityCountryCount() {
        throw new NotImplementedException();    }


}
