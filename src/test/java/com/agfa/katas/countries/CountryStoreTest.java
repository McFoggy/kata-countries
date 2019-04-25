package com.agfa.katas.countries;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class CountryStoreTest {
    @Test
    public void can_load_store() {
        CountryStore store = CountryStore.store();

        assertThat(store, notNullValue());

        List<Country> countries = store.getCountries();
        assertEquals(countries.size(), 250);
    }

    @Test
    public void first_country_is_Afghanistan() {
        Country country = CountryStore.store().getCountries().get(0);

        assertNotNull(country);
        assertEquals("Afghanistan", country.getName());
        assertEquals("Kabul", country.getCapital());
        assertEquals("AFG", country.getAlpha3Code());
        assertEquals("Asia", country.getRegion());
        assertEquals("Southern Asia", country.getSubRegion());
        assertEquals(27657145l, country.getPopulation());
        assertEquals(652230.0d, country.getSurface(), 0.0000001d);

        List<String> bordersWith = country.getBordersWith();
        assertThat(bordersWith, hasItems("IRN", "PAK", "TKM", "UZB", "TJK", "CHN"));
    }
}
