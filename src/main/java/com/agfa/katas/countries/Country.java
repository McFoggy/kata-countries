package com.agfa.katas.countries;

import javax.json.JsonObject;
import javax.json.JsonString;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A country object represents
 */
public class Country {
    private final String name;
    private String capital;
    private String alpha3Code;
    private String region;
    private String subRegion;
    private long population;
    private double surface;
    private List<String> bordersWith;

    public Country(String name) {
        this.name = name;
    }

    public static Country fromJson(JsonObject countryJson) {
        Country c = new Country(countryJson.getString("name"));
        c.alpha3Code = countryJson.getString("alpha3Code");
        c.capital = countryJson.getString("capital");
        c.region = countryJson.getString("region");
        c.subRegion = countryJson.getString("subregion");
        c.population = countryJson.getJsonNumber("population").longValueExact();

        if (countryJson.isNull("area")) {
            c.surface = 0.0d;
        } else {
            c.surface = countryJson.getJsonNumber("area").doubleValue();
        }

        c.bordersWith = countryJson.getJsonArray("borders")
                .stream()
                .map(JsonString.class::cast)
                .map(JsonString::getString)
                .collect(Collectors.toList());
        return c;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public String getRegion() {
        return region;
    }

    public String getSubRegion() {
        return subRegion;
    }

    public long getPopulation() {
        return population;
    }

    public double getSurface() {
        return surface;
    }

    public List<String> getBordersWith() {
        return bordersWith;
    }
}
