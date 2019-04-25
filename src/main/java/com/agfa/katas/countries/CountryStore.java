package com.agfa.katas.countries;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Repository of countries.
 * The data has been retrieved from https://restcountries.eu.
 */
public class CountryStore {
    private List<Country> countries;

    private CountryStore(List<Country> loadedCountries) {
        this.countries = new ArrayList<>(loadedCountries);
    }

    /**
     * Access the full list of countries this store object holds.
     * @return a non null & non modifiable list of Country objects.
     */
    public List<Country> getCountries() {
        return Collections.unmodifiableList(this.countries);
    }

    /**
     * Retrieve a store of countries in the form of a {@link CountryStore} object.
     * A unique CountryStore object is created per JVM.
     * @return a non null initialized store
     */
    public static CountryStore store() {
        return CountryStoreLazyHolder.INSTANCE;
    }

    /*
     * Implementation of 'initialization-on-demand holder' pattern.
     * See https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
     */
    private static class CountryStoreLazyHolder {
        static final CountryStore INSTANCE = new CountryStore(loadCountries());

        private static List<Country> loadCountries() {
            JsonArray jsonCountries = Json.createReader(CountryStore.class.getResourceAsStream("/countries.json")).readArray();

            List<Country> loadedCountries = jsonCountries.stream()
                    .map(JsonObject.class::cast)
                    .map(Country::fromJson)
                    .collect(Collectors.toList());

            return loadedCountries;
        }
    }

}
