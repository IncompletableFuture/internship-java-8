package ru.liga.helloworld.domain;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class World {
    private final List<Country> country;

    public World(List<Country> country) {
        this.country = country;
    }

    public List<String> getAllCitiesNamesWithoutWhitespacesMoreTenSymbolsSortedByName() {
        throw new NotImplementedException();
    }
}
