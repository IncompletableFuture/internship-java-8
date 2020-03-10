package ru.liga.helloworld.domain;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class Country {
    private final List<Region> regions;
    private final String name;

    public Country(String name, List<Region> regions) {
        this.regions = regions;
        this.name = name;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public String getName() {
        return name;
    }

    /**
     * Есть ли в стране города с короткими названиями (3 и меньше букв)
     * @return true - есть
     */
    public boolean hasCitiesWithThreeOrLessLetterName() {
        throw new NotImplementedException();
    }

}






