package com.techelevator.crm;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PetTest {


    Pet pet;

    @Before
    public void testSetup() {
        pet = new Pet("Vorg", "GSD");
    }

    @After
    public void testTearDown() {
        pet = null;
    }


    @Test
    public void listVaccinations_should_return_parvo_rabies_distemper_as_string_given_array_of_such() {

        List<String> vaccinations = new ArrayList<>();
        vaccinations.add("Parvo");
        vaccinations.add("Rabies");
        vaccinations.add("Distemper");

        pet.setVaccinations(vaccinations);

        String actual = pet.listVaccinations();
        String expected = "Parvo, Rabies, Distemper";

        Assert.assertEquals("Should output Parvo, Rabies, Distemper", expected, actual);

    }


}
