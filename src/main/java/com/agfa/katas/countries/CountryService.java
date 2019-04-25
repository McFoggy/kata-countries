package com.agfa.katas.countries;

import java.util.Optional;

/**
 * Provides high level API on top of the CountryStore
 */
public class CountryService {
    private final CountryStore store;

    public CountryService(CountryStore store) {
        this.store = store;
    }

//    BEGIN STEP-1
//    /**
//     * Tries to find a country inside the store which capital is the given one.
//     * @param capital the country capital to find
//     * @return the result of the find as an Optional
//     */
//    public Optional<Country> findByCapitalName(String capital) {
//        return Optional.empty();
//    }
//    END STEP-1
}
