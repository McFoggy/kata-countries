package com.agfa.katas.countries;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CountryServiceTest {
    private CountryService service;

    @Before
    public void init() {
        this.service = new CountryService(CountryStore.store());
    }

//    BEGIN STEP-1
//    @Test
//    public void cannot_find_Gotham() {
//        Optional<Country> c = this.service.findByCapitalName("Gotham City");
//
//        assertFalse("Gotham is a fiction we should not have found it", c.isPresent());
//    }
//
//    @Test
//    public void can_find_paris() {
//        Optional<Country> c = this.service.findByCapitalName("Paris");
//
//        assertTrue("we should have found a country object", c.isPresent());
//
//        Country country = c.get();
//        assertEquals("France", country.getName());
//    }
//    END STEP-1
}
