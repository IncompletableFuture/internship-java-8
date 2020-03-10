package ru.liga.helloworld.domain;

import java.util.List;

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
}






